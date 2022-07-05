package com.example.fmmall.service.Impl;

import com.example.fmmall.dao.OrderitemMapper;
import com.example.fmmall.dao.OrdersMapper;
import com.example.fmmall.dao.ProductskuMapper;
import com.example.fmmall.dao.ShoppingcartMapper;
import com.example.fmmall.entity.Orderitem;
import com.example.fmmall.entity.Orders;
import com.example.fmmall.entity.Productsku;
import com.example.fmmall.entity.ShoppingcartVO;
import com.example.fmmall.service.OrderService;
import com.example.fmmall.vo.ResStatus;
import com.example.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.*;

@Service
public class OrderServiceImpl   implements OrderService {


    @Autowired
    private ShoppingcartMapper shoppingcartMapper ;

    @Autowired
    private OrdersMapper ordersMapper ;

    @Autowired
    private OrderitemMapper orderitemMapper ;

    @Autowired
    private ProductskuMapper productskuMapper ;
//保存订单业务
    @Transactional
    public Map<String,String> addOrder(String cids,Orders order) throws SQLException  {
        Map<String,String> map=new HashMap<>() ;

        //1.根据cids查询当前订单中关联的购物车记录详情（包括库存）
        String[] arr = cids.split(",");
        List<Integer> cidsList=new ArrayList<>() ;
        for(int i=0;i<arr.length;i++){
            cidsList .add(Integer.parseInt(arr[i]) ) ;
        }

        List<ShoppingcartVO> list = shoppingcartMapper.selectShopcartByCids(cidsList);
        //2.校验库存
        boolean f=true;
        String untitled="";
        for(ShoppingcartVO sc:list){
            if(Integer .parseInt(sc.getCartnum())  >sc.getSkustock() ){
                f=false;
            }
            untitled=untitled+sc.getProductname() +",";
        }
        if(f){
            //表示库存充足
            order.setUnitled(untitled) ;
            order.setCreatetime(new Date()) ;
            order.setStatus("1");
            //生成订单编号
            String orderId = UUID.randomUUID().toString().replace("-", "");
            order .setOrderid(orderId) ;
            //保存订单
            int i= ordersMapper .insert(order) ;
                //生成商品快照

                for(ShoppingcartVO sc:list){
                    String itemId=System .currentTimeMillis() +""+(new Random().nextInt(8999)+1000);
                  Orderitem orderitem = new Orderitem(itemId,orderId ,sc.getProductid() ,sc.getProductname() ,sc.getProductimg() ,sc.getSkuid() ,sc.getSkuname() ,new BigDecimal(sc.getSellprice()) ,Integer.parseInt(sc.getCartnum()),new BigDecimal(sc.getSellprice()*Integer .parseInt(sc.getCartnum())),new Date(),new Date(),0) ;
                    int m = orderitemMapper.insert(orderitem);
                }


            //扣减库存
            for(ShoppingcartVO sc:list){
                String skuId=sc.getSkuid() ;
                int newStock=sc.getSkustock() -Integer .parseInt(sc.getCartnum()) ;

                Productsku productsku =new Productsku() ;
                productsku .setSkuid(skuId);
                productsku .setStock(newStock) ;

                productskuMapper .updateByPrimaryKeySelective(productsku);
            }

            //删除购物车,购买成功之后就删除
            for(int cid:cidsList){
                shoppingcartMapper .deleteByPrimaryKey(cid) ;
            }
           map.put("orderId",orderId );
            map.put("productNames",untitled );
            return map;



        }else{
            //表示库存不足
           return null;
        }


    }
    @Override
    public int updateOrderStatus(String orderId, String status) {
        Orders orders =new Orders() ;
        orders.setOrderid(orderId ) ;
        orders .setStatus(status ) ;
        int i = ordersMapper.updateByPrimaryKeySelective(orders);
        return i;
    }

    @Override
    public ResultVO getOrderById(String orderId) {
        Orders orders = ordersMapper.selectByPrimaryKey(orderId);
        return new ResultVO(ResStatus.OK,"success",orders.getStatus() );
    }
}
