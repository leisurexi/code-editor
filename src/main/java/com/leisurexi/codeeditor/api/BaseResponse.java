package com.leisurexi.codeeditor.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BaseResponse {

    private int code;
    private String message;

    public BaseResponse() {
        this.code = ResultCode.SUCCESS.code;
        this.message = ResultCode.SUCCESS.msg;
    }

    public BaseResponse(ResultCode resultCode) {
        this.code = resultCode.code;
        this.message = resultCode.msg;
    }
}
