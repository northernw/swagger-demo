package com.github.demo.easy.entity;

/**
 * 用户操作实体
 *
 * @author wangyuanqing1
 * @date 2021/7/6
 */
public class UserOperation {
    private User target;

    public UserOperation(User target) {
        this.target = target;
    }

    /**
     * 是否能添加
     *
     * @return
     */
    public Boolean getAdd() {
        return Boolean.TRUE;
    }

    /**
     * 是否能修改
     *
     * @return
     */
    public Boolean getModify() {
        return Boolean.TRUE;
    }
}
