package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Schema(description = "学校初始化")
public record SchoolSettingRequest(@NotEmpty @Schema(description = "学年名称") String name,
                                   @NotEmpty @Schema(description = "学期名称") String semester,
                                   @NotEmpty @Schema(description = "开始时间") LocalDateTime startTime,
                                   @NotEmpty @Schema(description = "结束时间") LocalDateTime endTime) {
}
