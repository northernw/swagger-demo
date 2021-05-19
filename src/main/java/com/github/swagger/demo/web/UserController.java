package com.github.swagger.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/hello")
    public String hello(@RequestBody String name) {
        return "hello " + name;
    }
}
