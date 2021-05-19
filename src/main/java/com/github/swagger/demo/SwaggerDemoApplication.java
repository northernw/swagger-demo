package com.github.swagger.demo;

import com.swagger2.easyswagger.annotation.EnableEasySwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger ui url: http://localhost:8080/swagger-ui.html#/
 */
@EnableSwagger2
@EnableEasySwagger
@SpringBootApplication
public class SwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemoApplication.class, args);
    }

}
