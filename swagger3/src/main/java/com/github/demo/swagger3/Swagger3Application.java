package com.github.demo.swagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * swagger ui url: http://localhost:8080/swagger-ui/index.html#/
 */
@EnableOpenApi
@SpringBootApplication
public class Swagger3Application {

    public static void main(String[] args) {
        SpringApplication.run(Swagger3Application.class, args);
    }

}
