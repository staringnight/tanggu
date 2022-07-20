package com.pokeya.tanggu.infrastructure.mapper;

import com.pokeya.tanggu.infrastructure.model.City;import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> getAllCityList();
}