package com.github.demo.swagger3.web;

import com.github.demo.swagger3.entity.ApiResponse;
import com.github.demo.swagger3.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @PostMapping("/hello")
    public ApiResponse<User> hello(@RequestBody String name) {
        return ApiResponse.<User>builder()
                .data(User.builder().name(name).build())
                .build();
    }

    @GetMapping("/list")
    public ApiResponse<List<User>> list() {
        return ApiResponse.<List<User>>builder().build();
    }
}
