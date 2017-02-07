package com.example.user.enums;

public enum ErrorCodeEnum {
    OK(200,"ok"),
    USER_NOTFOUND(1000,"user not found"),
    SYSTEM_ERROR(500,"system error");    

    private int code;
    private String message;

    ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
