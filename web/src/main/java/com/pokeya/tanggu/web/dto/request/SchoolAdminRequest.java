package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description = "学校超管信息")
public record SchoolAdminRequest(@NotEmpty @Schema(description = "姓名") String name,
                                 @NotEmpty @Schema(description = "身份证号") String idNumber,
                                 @NotEmpty @Schema(description = "手机号") String phone,
                                 @NotEmpty @Schema(description = "学校管理授权书") String schoolAuthorization) implements Serializable {

}
