package com.github.demo.easy.web;

import com.github.demo.easy.entity.ApiResponse;
import com.github.demo.easy.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户接口
 *
 * @author wangyuanqing1
 * @since 2021/07/07
 */
@RequestMapping("/user")
@RestController
public class UserController {

    /**
     * 打个招呼
     *
     * @param name 姓名
     */
    @PostMapping("/hello")
    public ApiResponse<User> hello(@RequestBody String name) {
        return ApiResponse.<User>builder()
                .data(User.builder().name(name).build())
                .build();
    }

    /**
     * 列表
     */
    @GetMapping("/list")
    public ApiResponse<List<User>> list() {
        return ApiResponse.<List<User>>builder().build();
    }
}
