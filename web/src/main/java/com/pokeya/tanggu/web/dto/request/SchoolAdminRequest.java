package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(title = "学校超管信息")
public record SchoolAdminRequest(@Schema(title = "学校超管id") Long id, @Schema(title = "姓名") String name,
                                  @Schema(title = "身份证号") String idNumber,
                                  @Schema(title = "手机号") String phone,
                                  @Schema(title = "学校管理授权书") String schoolAuthorization) implements Serializable {

}
