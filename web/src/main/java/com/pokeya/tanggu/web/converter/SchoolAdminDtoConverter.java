package com.pokeya.tanggu.web.converter;

import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import com.pokeya.tanggu.web.dto.response.SchoolAdminResponse;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SchoolAdminDtoConverter extends BaseConverter<SchoolAdminDto, SchoolAdminResponse> {
    SchoolAdminDtoConverter INSTANCES = Mappers.getMapper(SchoolAdminDtoConverter.class);
}
