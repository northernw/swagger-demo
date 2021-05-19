package com.github.swagger.demo.web;

import com.github.swagger.demo.entity.User;
import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * 你好吗
     *
     * @param name 姓名
     * @return
     */
    @PostMapping("/hello")
    public String hello(@RequestBody String name) {
        return "hello " + name;
    }

    /**
     * 获取所有用户
     *
     * @return
     */
    @GetMapping("/list")
    public List<User> list() {
        return Lists.newArrayList();
    }

    /**
     * 添加用户
     *
     * @param user 用户
     * @return
     */
    @PostMapping("/add")
    public Long add(@RequestBody User user) {
        return 1L;
    }
}
