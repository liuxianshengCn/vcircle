package com.v.circle.cloud.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDto<T> implements Serializable {

    private String resultCode;
    private String resultMessage;

    private T resultModel;

    public ResultDto(){
        this.setResultCode("1001");
        this.setResultMessage("操做成功");
    }


    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("resultCode=")
                .append(resultCode)
                .append(",resultMessage=")
                .append(resultMessage);
        return stringBuffer.toString();
    }

}
