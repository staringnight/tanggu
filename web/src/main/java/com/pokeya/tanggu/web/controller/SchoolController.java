package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.service.biz.SchoolBiz;
import com.pokeya.tanggu.service.dto.SchoolDto;
import com.pokeya.tanggu.web.converter.SchoolDtoConverter;
import com.pokeya.tanggu.web.converter.SchoolResponseConverter;
import com.pokeya.tanggu.web.dto.request.EntityIdRequest;
import com.pokeya.tanggu.web.dto.request.SchoolSettingRequest;
import com.pokeya.tanggu.web.dto.response.SchoolListResponse;
import com.pokeya.tanggu.web.dto.response.SchoolResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import com.pokeya.yao.dict.TokenEnum;
import com.pokeya.yao.utils.SecurityUtil;
import com.pokeya.yao.utils.beans.JwtUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author mac
 */
@Tag(name = "school", description = "学校接口")
@RestController("school")
@RequiredArgsConstructor
public class SchoolController {

    private final SecurityUtil securityUtil;
    private final SchoolBiz schoolBiz;

    @ResponseBody
    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getSchoolById")
    public SchoolResponse getSchoolById(@Valid EntityIdRequest entityIdRequest) {
        SchoolDto schoolDto = schoolBiz.getSchoolById(entityIdRequest.id());
        return SchoolResponseConverter.INSTANCES.sourceToTarget(schoolDto);
    }

    @ResponseBody
    @Operation(summary = "获取学校list")
    @GetMappingWithClientCache("getSchoolList")
    public SchoolListResponse getSchoolList() {
        JwtUser jwtUser = securityUtil.getAllClaims().get(TokenEnum.BASE.getCode(), JwtUser.class);
        List<SchoolDto> schoolDtoList = schoolBiz.getSchoolList(jwtUser.getId());
        return new SchoolListResponse(SchoolDtoConverter.INSTANCES.sourceToTarget(schoolDtoList));
    }

    @ResponseBody
    @Operation(summary = "初始化学校设置")
    @PostMapping("initSchoolSetting")
    public void initSchoolSetting(@Valid @RequestBody SchoolSettingRequest schoolSettingRequest) {

    }

}
