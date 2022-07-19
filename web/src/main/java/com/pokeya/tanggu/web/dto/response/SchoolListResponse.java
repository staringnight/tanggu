package com.pokeya.tanggu.web.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * @author mac
 */
@Schema(description ="学校list信息")
public record SchoolListResponse(
        @Schema(description ="学校List") List<SchoolListItem> schoolListItemList) implements Serializable {
    public record SchoolListItem(@Schema(description ="学校id") Long id, @Schema(description ="全称") String name,
                                 @Schema(description ="简称") String shortName,
                                 @Schema(description ="状态,0 默认，1认证通过 2认证失败 3 初始化成功") String status) {

    }
}

