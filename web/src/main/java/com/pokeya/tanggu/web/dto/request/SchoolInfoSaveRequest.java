package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(title = "学校超管保存信息")
public record SchoolInfoSaveRequest(@Schema(title = "学校") SchoolRequest schoolRequest,
                                @Schema(title = "超管") SchoolAdminResponse schoolAdminResponse) implements Serializable {

}