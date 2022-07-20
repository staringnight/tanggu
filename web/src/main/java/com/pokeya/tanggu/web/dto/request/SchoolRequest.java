package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description = "学校信息")
public record SchoolRequest(@NotEmpty @Schema(description = "全称") String name,
                            @NotEmpty @Schema(description = "组织机构代码") String organizationCode,
                            @NotEmpty @Schema(description = "简称") String shortName,
                            @Schema(description = "办学许可证") String schoolPermit,
                            @Schema(description = "营业执照") String businessLicense,
                            @NotEmpty @Schema(description = "办学性质") String schoolNature,
                            @NotEmpty @Schema(description = "等级评定") String rating,
                            @NotEmpty @Schema(description = "学段") String learningPeriod,
                            @NotEmpty @Schema(description = "地址") String address) implements Serializable {

}
