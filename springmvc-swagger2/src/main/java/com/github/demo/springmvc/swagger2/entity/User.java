package com.github.demo.springmvc.swagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangyuanqing1
 * 2021/5/19
 */
@ApiModel(description = "用户对象")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    @ApiModelProperty(value = "姓名")
    private String name;
    private Integer age;
    private UserOperation userOperation;

    public String getNickName() {
        return name + "-nickname";
    }
}
