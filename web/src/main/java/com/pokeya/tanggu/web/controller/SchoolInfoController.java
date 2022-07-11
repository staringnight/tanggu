package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.web.dto.request.SchoolInfoSaveRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@Tag(description = "学校基本信息接口", name = "schoolInfo")
@RestController("schoolInfo")
public class SchoolInfoController {

    @ResponseBody
    @Operation(summary = "学校创建", description = "返回学校id")
    @PostMapping("saveSchoolInfo")
    public Long saveSchoolInfo(@RequestBody SchoolInfoSaveRequest schoolRequest) {
        return null;
    }

}
