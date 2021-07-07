package com.github.demo.springmvc.swagger2.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用响应
 *
 * @author wangyuanqing1
 * 2021/5/20
 */
@ApiModel(description = "通用返回对象")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private Integer code;
    private Boolean success;
    private T data;
}
