package com.github.demo.swagger3.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ApiModel(description = "用户")
public class User {
    @ApiModelProperty(notes = "姓名")
    private String name;
    @ApiModelProperty(notes = "年龄")
    private Integer age;
}
