package com.pokeya.tanggu.infrastructure.converter;

import com.pokeya.tanggu.infrastructure.model.School;
import com.pokeya.tanggu.service.dto.SchoolDto;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SchoolConverter extends BaseConverter<School, SchoolDto> {
    SchoolConverter INSTANCES = Mappers.getMapper(SchoolConverter.class);
}
