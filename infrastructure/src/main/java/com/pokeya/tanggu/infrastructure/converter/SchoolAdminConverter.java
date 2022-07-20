package com.pokeya.tanggu.infrastructure.converter;

import com.pokeya.tanggu.infrastructure.model.SchoolAdmin;
import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SchoolAdminConverter extends BaseConverter<SchoolAdmin, SchoolAdminDto> {
    SchoolAdminConverter INSTANCES = Mappers.getMapper(SchoolAdminConverter.class);
}
