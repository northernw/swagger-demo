package com.github.demo.springmvc.swagger2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author wangyuanqing1
 * @date 2021/7/6
 */
@ApiModel(description = "用户操作")
public class UserOperation {
    private User target;

    public UserOperation(User target) {
        this.target = target;
    }

    @ApiModelProperty("添加")
    public Boolean getAdd() {
        return Boolean.TRUE;
    }

    public Boolean getModify() {
        return Boolean.TRUE;
    }
}
