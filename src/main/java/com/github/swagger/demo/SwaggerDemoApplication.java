package com.github.swagger.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * swagger ui url: http://localhost:8080/swagger-ui/index.html#/
 */
@EnableOpenApi
@SpringBootApplication
public class SwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemoApplication.class, args);
    }

}
