package com.example.user.dto;

import com.example.user.enums.ErrorCodeEnum;
import lombok.Data;

@Data
public class Result<T> {
    private int code;
    private String message;
    private T data;

    public Result(ErrorCodeEnum codeEnum,T data){
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        this.data = data;
    }
}
