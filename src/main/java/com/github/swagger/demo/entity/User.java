package com.github.swagger.demo.entity;

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
}
