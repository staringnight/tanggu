package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.service.biz.SchoolAdminBiz;
import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import com.pokeya.tanggu.web.converter.SchoolAdminDtoConverter;
import com.pokeya.tanggu.web.dto.request.EntityIdRequest;
import com.pokeya.tanggu.web.dto.response.SchoolAdminResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author mac
 */
@Tag(description = "学校超管接口", name = "schoolAdmin")
@RestController("schoolAdmin")
@RequiredArgsConstructor
public class SchoolAdminController {
    private final SchoolAdminBiz schoolAdminBiz;

    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getSchoolAdminInfoById")
    public SchoolAdminResponse getSchoolInfoById(@Valid EntityIdRequest entityIdRequest) {
        SchoolAdminDto schoolAdminDto = schoolAdminBiz.getSchoolInfoById(entityIdRequest.id());
        return SchoolAdminDtoConverter.INSTANCES.sourceToTarget(schoolAdminDto);
    }

    @Operation(summary = "通过schoolId获取")
    @GetMappingWithClientCache("getSchoolAdminInfoBySchoolId")
    public List<SchoolAdminResponse> getSchoolAdminInfoBySchoolId(@Valid EntityIdRequest entityIdRequest) {
        List<SchoolAdminDto> schoolAdminDtoList = schoolAdminBiz.getSchoolAdminInfoBySchoolId(entityIdRequest.id());
        return SchoolAdminDtoConverter.INSTANCES.sourceToTarget(schoolAdminDtoList);
    }
}
