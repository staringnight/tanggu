package com.pokeya.tanggu.infrastructure.repository;


import com.pokeya.tanggu.infrastructure.converter.CityConverter;
import com.pokeya.tanggu.infrastructure.mapper.CityMapper;
import com.pokeya.tanggu.infrastructure.model.City;
import com.pokeya.tanggu.service.acl.CityService;
import com.pokeya.tanggu.service.bo.CityBo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mac
 */
@RequiredArgsConstructor
@Repository
public class CityServiceRepository implements CityService {

    private final CityMapper cityMapper;

    @Override
    public List<CityBo> getAllCityList() {
        List<City> cityList = cityMapper.getAllCityList();
        return CityConverter.INSTANCES.sourceToTarget(cityList);
    }
}
