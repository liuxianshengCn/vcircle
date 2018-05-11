package com.v.circle.cloud.controller;

import com.v.circle.cloud.base.RestException;
import com.v.circle.cloud.base.ResultDto;
import com.v.circle.cloud.model.DemoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1.0")
@Api(description = "Swagger示例类")
public class DemoController {


    @ApiOperation(value="Swagger使用示例-功能名称",notes = "详细介绍：Swagger使用示例，参数任意，特殊参数1001：返回异常状态")
    @ApiImplicitParams({@ApiImplicitParam(paramType = "header",name = "token",value = "token",required = true)})
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public ResultDto<DemoVo> hello(DemoVo vo) {
        ResultDto resultDto = new ResultDto();
        resultDto.setResultModel(vo);

        if ("1001".equals(vo.getCode())){
            throw new RestException("1001","运行异常");
        }

        return resultDto;
    }

}
