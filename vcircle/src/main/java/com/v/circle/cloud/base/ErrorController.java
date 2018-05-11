package com.v.circle.cloud.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Dell
 * @Date 2018/1/24 10:56
 * @Description 公共异常统一处理类
 */
@Slf4j
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = RestException.class)
    @ResponseBody
    public ResultDto errorHandler(RestException e){
        ResultDto resultDto = new ResultDto();
        resultDto.setResultCode(e.getErrorCode());
        resultDto.setResultMessage(e.getErrorMessage());
        resultDto.setResultModel(e);
        log.error("主动异常",e);
        return resultDto;
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultDto errorHandler(Exception e){
        ResultDto resultDto = new ResultDto();
        resultDto.setResultCode("2001");
        resultDto.setResultMessage(e.getMessage());
        resultDto.setResultModel(e);
        log.error("系统异常",e);
        return resultDto;
    }

}
