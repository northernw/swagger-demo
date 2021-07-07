package com.github.demo.easy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用响应对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private Integer code; // 编码
    private Boolean success; // 是否成功
    private T data; // 数据
}
