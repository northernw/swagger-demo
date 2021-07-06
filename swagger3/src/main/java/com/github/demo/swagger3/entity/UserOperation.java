package com.github.demo.swagger3.entity;

/**
 * @author wangyuanqing1
 * @date 2021/7/6
 */
public class UserOperation {
    private User target;

    public UserOperation(User target) {
        this.target = target;
    }

    public Boolean getAdd() {
        return Boolean.TRUE;
    }

    public Boolean getModify() {
        return Boolean.TRUE;
    }
}
