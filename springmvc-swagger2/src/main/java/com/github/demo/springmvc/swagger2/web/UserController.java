package com.github.demo.springmvc.swagger2.web;

import com.github.demo.springmvc.swagger2.entity.User;
import com.github.demo.springmvc.swagger2.entity.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@Api(tags = "用户模块", description = "用户")
@RequestMapping("/user")
@RestController
public class UserController {

    @ApiOperation(value = "打个招呼")
    @PostMapping("/hello")
    public ApiResponse<User> hello(@RequestBody String name) {
        return ApiResponse.<User>builder()
                .data(User.builder().name(name).build())
                .build();
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public ApiResponse<List<User>> list() {
        return ApiResponse.<List<User>>builder().build();
    }
}
