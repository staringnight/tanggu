package com.pokeya.tanggu.web.converter;

import com.pokeya.tanggu.service.dto.SchoolDto;
import com.pokeya.tanggu.web.dto.response.SchoolResponse;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SchoolResponseConverter extends BaseConverter<SchoolDto, SchoolResponse> {
    SchoolResponseConverter INSTANCES = Mappers.getMapper(SchoolResponseConverter.class);
}
