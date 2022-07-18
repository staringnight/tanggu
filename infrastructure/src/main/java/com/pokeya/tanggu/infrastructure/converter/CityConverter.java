package com.pokeya.tanggu.infrastructure.converter;

import com.pokeya.tanggu.infrastructure.model.City;
import com.pokeya.tanggu.service.bo.CityBo;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CityConverter extends BaseConverter<City, CityBo> {
    CityConverter INSTANCES = Mappers.getMapper(CityConverter.class);
}
