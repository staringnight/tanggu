package com.pokeya.tanggu.web.controller;

import com.pokeya.tanggu.service.biz.CityBiz;
import com.pokeya.tanggu.service.dto.CityItem;
import com.pokeya.tanggu.web.dto.response.CityResponse;
import com.pokeya.yao.annotation.GetMappingWithClientCache;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mac
 */
@Tag(name = "city", description = "城市接口")
@RestController("city")
@RequiredArgsConstructor
public class CityController {
    private final CityBiz cityBiz;

    @ResponseBody
    @Operation(summary = "获取全量城市")
    @GetMappingWithClientCache("getAllCityList")
    public CityResponse getAllCityList() {
        List<CityItem> allCityList = cityBiz.getAllCityList();
        return new CityResponse(allCityList);
    }

}
