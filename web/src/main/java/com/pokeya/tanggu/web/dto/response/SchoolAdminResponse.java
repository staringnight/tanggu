package com.pokeya.tanggu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description ="学校超管信息")
public record SchoolAdminResponse(@Schema(description ="学校超管id") Long id, @Schema(description ="姓名") String name,
                                  @Schema(description ="身份证号") String idNumber,
                                  @Schema(description ="手机号") String phone,
                                  @Schema(description ="学校管理授权书") String schoolAuthorization) implements Serializable {

}
