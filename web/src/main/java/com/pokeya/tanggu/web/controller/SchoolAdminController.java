package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.web.dto.request.EntityIdRequest;
import com.pokeya.tanggu.web.dto.response.SchoolAdminResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mac
 */
@Tag(description = "学校超管接口", name = "schoolAdmin")
@RestController("schoolAdmin")
public class SchoolAdminController {

    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getSchoolAdminInfoById")
    public SchoolAdminResponse getSchoolInfoById(EntityIdRequest entityIdRequest) {
        return null;
    }

    @Operation(summary = "通过schoolId获取")
    @GetMappingWithClientCache("getSchoolAdminInfoBySchoolId")
    public List<SchoolAdminResponse> getSchoolAdminInfoBySchoolId(EntityIdRequest entityIdRequest) {
        return null;
    }
}
