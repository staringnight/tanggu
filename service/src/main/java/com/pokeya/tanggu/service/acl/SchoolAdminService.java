package com.pokeya.tanggu.service.acl;

import com.pokeya.tanggu.service.dto.SchoolAdminDto;

import java.util.List;

public interface SchoolAdminService {
    SchoolAdminDto getSchoolInfoById(Long schoolAdminId);

    List<SchoolAdminDto> getSchoolAdminInfoBySchoolId(Long schoolId);

    Long saveSchoolAdmin(SchoolAdminDto schoolAdminDto);
}
