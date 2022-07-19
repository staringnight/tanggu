package com.pokeya.tanggu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description ="学校信息")
public record SchoolResponse(@Schema(description ="学校id") Long id, @Schema(description ="全称") String name,
                             @Schema(description ="组织机构代码") String organizationCode,
                             @Schema(description ="简称") String shortName,
                             @Schema(description ="办学许可证") String schoolPermit,
                             @Schema(description ="营业执照") String businessLicense,
                             @Schema(description ="办学性质") String schoolNature,
                             @Schema(description ="等级评定") String rating,
                             @Schema(description ="省id") Integer provinceId,
                             @Schema(description ="市id") Integer cityId,
                             @Schema(description ="区id") Integer areaId,
                             @Schema(description ="学段") String learningPeriod,
                             @Schema(description ="地址") String address,
                             @Schema(description ="认证失败理由") String refuseReason,
                             @Schema(description ="状态,0 默认，1认证通过 2认证失败 3 初始化成功") String status) implements Serializable {

}
