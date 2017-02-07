package com.example.user.exception;

import com.example.user.enums.ErrorCodeEnum;

public class BusinessException extends RuntimeException {
    private ErrorCodeEnum errorCodeEnum; //异常对应的描述信息
    public BusinessException(String msg) {
        super(msg);
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public BusinessException(ErrorCodeEnum codeEnum) {
        super();
        this.errorCodeEnum = codeEnum;
    }
}
