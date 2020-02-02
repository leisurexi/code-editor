package com.leisurexi.codeeditor.exception;

import com.leisurexi.codeeditor.api.BaseResponse;
import com.leisurexi.codeeditor.api.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionTranslator {

    @ExceptionHandler(ConstraintViolationException.class)
    public BaseResponse handleError(ConstraintViolationException e) {
        log.error("参数错误: {}", e.getLocalizedMessage());
        return BaseResponse
                .builder()
                .code(ResultCode.PARAM_BIND_ERROR.getCode())
                .message(e.getMessage())
                .build();
    }

    @ExceptionHandler(Throwable.class)
    public BaseResponse handleError(Throwable e) {
        e.printStackTrace();
        log.error(e.toString());
        return BaseResponse
                .builder()
                .code(ResultCode.INTERNAL_SERVER_ERROR.getCode())
                .message(e.toString())
                .build();
    }
}
