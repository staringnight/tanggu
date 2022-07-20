package com.pokeya.tanggu.service.acl;

import com.pokeya.tanggu.service.dto.SchoolDto;

import java.util.List;

public interface SchoolService {
    List<SchoolDto> getSchoolList(Long userId);

    SchoolDto getSchoolById(Long schoolId);

    Long saveSchool(SchoolDto schoolDto);
}
