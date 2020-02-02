package com.leisurexi.codeeditor.controller;

import com.leisurexi.codeeditor.api.BaseResponse;
import com.leisurexi.codeeditor.dto.ExecuteCodeResponse;
import com.leisurexi.codeeditor.dto.ExecuteResults;
import com.leisurexi.codeeditor.service.IndexService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

/**
 * @author: leisurexi
 * @date: 2020-02-01 9:33 下午
 * @description:
 * @since JDK 1.8
 */
@RestController
@Validated
public class IndexController {

    @Resource
    private IndexService indexService;

    @PostMapping("execute_code")
    public BaseResponse executeCode(@NotBlank(message = "请输入代码") String code) throws Exception {
        ExecuteResults executeResults = indexService.executeCode(code);
        return new ExecuteCodeResponse(executeResults);
    }

}
