package com.leisurexi.codeeditor.dto;

import com.leisurexi.codeeditor.api.BaseResponse;
import lombok.*;

/**
 * @author: leisurexi
 * @date: 2020-02-01 10:12 下午
 * @description:
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ExecuteCodeResponse extends BaseResponse {

    private ExecuteResults results;

}
