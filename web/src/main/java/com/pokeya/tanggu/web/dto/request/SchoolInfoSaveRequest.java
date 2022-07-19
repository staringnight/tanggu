package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description ="学校超管保存信息")
public record SchoolInfoSaveRequest(@NotEmpty @Schema(description ="学校") SchoolRequest schoolRequest,
                                    @NotEmpty @Schema(description ="超管") SchoolAdminRequest schoolAdminRequest) implements Serializable {

}
