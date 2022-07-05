package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //swagger会帮助我们生成接口文档
    //Docket封装接口文档信息
    @Bean
    public Docket getDocket(){
        Docket docket=new Docket(DocumentationType .SWAGGER_2 ) ;//指定文档风格
//创建封面信息对象
       ApiInfoBuilder apiInfoBuilder =new ApiInfoBuilder() ;
       apiInfoBuilder .title("《宠物商城》后端接口说明")
                       .description("此文档详细说明了项目后端接口规范")
                      .version("v 2.0.1")
                     .contact(new Contact("pxp","www.pxp.com","3239170852@qq.com") );
       ApiInfo apiInfo =apiInfoBuilder .build() ;

        docket .apiInfo(apiInfo) ;//指定生成文档中的封面信息:文档标题，作者，版本
        docket.select()
                .apis(RequestHandlerSelectors .basePackage("com.example.controller") )
                .paths(PathSelectors.any())
                .build()  ;



        return docket ;
    }
}
