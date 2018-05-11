package com.v.circle.cloud.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author Dell
 * @Date 2018/1/24 10:59
 * @Description
 */
@Data
public class RestException extends RuntimeException implements Serializable{

    private String errorCode;
    private String errorMessage;

    public RestException(){}

    public RestException(String errorCode,String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
