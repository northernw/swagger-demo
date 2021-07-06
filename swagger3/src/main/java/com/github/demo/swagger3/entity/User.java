package com.github.demo.swagger3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private String name;
    private Integer age;
    private UserOperation userOperation;

    public String getNickName() {
        return name + "-nickname";
    }
}
