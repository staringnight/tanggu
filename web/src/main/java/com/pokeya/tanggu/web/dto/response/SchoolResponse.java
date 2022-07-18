package com.pokeya.tanggu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

/**
 * @author mac
 */
@Schema(title = "学校信息")
public record SchoolResponse(@Schema(title = "学校id") Long id, @Schema(title = "全称") String name,
                             @Schema(title = "组织机构代码") String organizationCode,
                             @Schema(title = "简称") String shortName,
                             @Schema(title = "办学许可证") String schoolPermit,
                             @Schema(title = "营业执照") String businessLicense,
                             @Schema(title = "办学性质") String schoolNature,
                             @Schema(title = "等级评定") String rating,
                             @Schema(title = "省id") Integer provinceId,
                             @Schema(title = "市id") Integer cityId,
                             @Schema(title = "区id") Integer areaId,
                             @Schema(title = "学段") String learningPeriod,
                             @Schema(title = "地址") String address,
                             @Schema(title = "认证失败理由") String refuseReason,
                             @Schema(title = "状态,0 默认，1认证通过 2认证失败 3 初始化成功") String status) implements Serializable {

}
