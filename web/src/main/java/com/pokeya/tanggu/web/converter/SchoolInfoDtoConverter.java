package com.pokeya.tanggu.web.converter;

import com.pokeya.tanggu.service.dto.SchoolInfoDto;
import com.pokeya.tanggu.web.dto.request.SchoolInfoSaveRequest;
import com.pokeya.yao.utils.BaseConverter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SchoolInfoDtoConverter extends BaseConverter<SchoolInfoSaveRequest, SchoolInfoDto> {
    SchoolInfoDtoConverter INSTANCES = Mappers.getMapper(SchoolInfoDtoConverter.class);

    @Mapping(source = "schoolRequest", target = "schoolDto")
    @Mapping(source = "schoolAdminRequest", target = "schoolAdminDto")
    @Override
    SchoolInfoDto sourceToTarget(SchoolInfoSaveRequest var1);

}
