package com.kuaiyu.ai.speech.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
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

/**
 * @Author: kuaiyu-yyk
 * @Description: swagger配置值类
 * @Date: 2020/10/13 上午 09:04
 * @Version:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${kuaiyu.version:1.0.0}")
    private String version;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("快鱼基础能力接口文档")
                .description("快鱼基础能力服务")
                .contact(new Contact("北京快鱼电子股份公司", "http://www.kuaiyu.com", "yyk@kuaiyu.com"))
                .version(version)
                .build();
    }

}
