package com.leisurexi.codeeditor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: leisurexi
 * @date: 2020-02-02 3:48 下午
 * @description:
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExecuteResults {

    /**
     * 编译是否成功
     */
    private boolean compiled;

    /**
     * 编译失败此字段值为错误信息
     */
    private List<String> errorMessage;

    /**
     * 运行输出信息
     */
    private String stdout;

}
