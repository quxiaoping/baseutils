package com.example.user.exception;

import com.example.user.dto.Result;
import com.example.user.enums.ErrorCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultExceptionHandler(HttpServletRequest request, Exception e) {
        Result result = new Result(ErrorCodeEnum.SYSTEM_ERROR, null);
        logger.error("========通用异常捕获！========", e);
        return result;
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public Result BusinessExceptionHandler(HttpServletRequest request, BusinessException e) {
        Result result = new Result(e.getErrorCodeEnum(),null);
        logger.error("========业务逻辑异常捕获！========", e);
        logger.error("========业务逻辑异常捕获！========", e.getErrorCodeEnum().getCode());
        logger.error("========业务逻辑异常捕获！========", e.getErrorCodeEnum().getMessage());
        return result;
    }
}
