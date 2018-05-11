package com.v.circle.cloud.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("测试类")
public class DemoVo {


    @ApiModelProperty(value = "编号",required=true)
    private String code;
    @ApiModelProperty("编号内容")
    private String codeMsg;

    @ApiModelProperty(value = "姓名",required = true)
    private String name;
    @ApiModelProperty("年龄")
    private int age;

    @ApiModelProperty(value = "生日")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date birthday;
}
