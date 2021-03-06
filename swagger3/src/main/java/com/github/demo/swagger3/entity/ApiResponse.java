package com.github.demo.swagger3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ιη¨εεΊ
 * @author wangyuanqing1
 * 2021/5/20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse<T> {
    private Integer code;
    private Boolean success;
    private T data;
}
