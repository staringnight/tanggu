package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.web.dto.request.EntityIdRequest;
import com.pokeya.tanggu.web.dto.response.SchoolResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mac
 */
@Tag(name = "school", description = "学校接口")
@RestController("school")
public class SchoolController {

    @ResponseBody
    @Operation(summary = "通过id获取")
    @GetMappingWithClientCache("getSchoolById")
    public SchoolResponse getSchoolById(EntityIdRequest entityIdRequest) {
        return null;
    }


}
