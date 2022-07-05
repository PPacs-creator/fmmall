package com.example.fmmall.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Category {
    /**
     * 主键 分类id主键
     */
    @Id
    @Column(name = "categoryId")
    private Integer categoryid;

    /**
     * 分类名称 分类名称
     */
    @Column(name = "categoryName")
    private String categoryname;

    /**
     * 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    @Column(name = "categoryLevel")
    private Integer categorylevel;

    /**
     * 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 图标 logo
     */
    @Column(name = "categoryIcon")
    private String categoryicon;

    /**
     * 口号
     */
    @Column(name = "categorySlogan")
    private String categoryslogan;

    /**
     * 分类图
     */
    @Column(name = "categoryPic")
    private String categorypic;

    /**
     * 背景颜色
     */
    @Column(name = "categoryBgcolor")
    private String categorybgcolor;

    /**
     * 获取主键 分类id主键
     *
     * @return categoryId - 主键 分类id主键
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * 设置主键 分类id主键
     *
     * @param categoryid 主键 分类id主键
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 获取分类名称 分类名称
     *
     * @return categoryName - 分类名称 分类名称
     */
    public String getCategoryname() {
        return categoryname;
    }

    /**
     * 设置分类名称 分类名称
     *
     * @param categoryname 分类名称 分类名称
     */
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    /**
     * 获取分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     *
     * @return categoryLevel - 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    public Integer getCategorylevel() {
        return categorylevel;
    }

    /**
     * 设置分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     *
     * @param categorylevel 分类层级 分类得类型，
1:一级大分类
2:二级分类
3:三级小分类
     */
    public void setCategorylevel(Integer categorylevel) {
        this.categorylevel = categorylevel;
    }

    /**
     * 获取父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     *
     * @return parentId - 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     *
     * @param parentid 父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取图标 logo
     *
     * @return categoryIcon - 图标 logo
     */
    public String getCategoryicon() {
        return categoryicon;
    }

    /**
     * 设置图标 logo
     *
     * @param categoryicon 图标 logo
     */
    public void setCategoryicon(String categoryicon) {
        this.categoryicon = categoryicon;
    }

    /**
     * 获取口号
     *
     * @return categorySlogan - 口号
     */
    public String getCategoryslogan() {
        return categoryslogan;
    }

    /**
     * 设置口号
     *
     * @param categoryslogan 口号
     */
    public void setCategoryslogan(String categoryslogan) {
        this.categoryslogan = categoryslogan;
    }

    /**
     * 获取分类图
     *
     * @return categoryPic - 分类图
     */
    public String getCategorypic() {
        return categorypic;
    }

    /**
     * 设置分类图
     *
     * @param categorypic 分类图
     */
    public void setCategorypic(String categorypic) {
        this.categorypic = categorypic;
    }

    /**
     * 获取背景颜色
     *
     * @return categoryBgcolor - 背景颜色
     */
    public String getCategorybgcolor() {
        return categorybgcolor;
    }

    /**
     * 设置背景颜色
     *
     * @param categorybgcolor 背景颜色
     */
    public void setCategorybgcolor(String categorybgcolor) {
        this.categorybgcolor = categorybgcolor;
    }
}