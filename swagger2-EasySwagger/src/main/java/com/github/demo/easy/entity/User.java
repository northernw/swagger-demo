package com.github.demo.easy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体
 *
 * @author wangyuanqing1
 * 2021/5/19
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    /**
     * 姓名
     */
    private String name; // 姓名
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 用户操作实体
     */
    private UserOperation userOperation;

    /**
     * 昵称
     *
     * @return
     */
    public String getNickName() {
        return name + "-nickname";
    }
}
