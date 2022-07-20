package com.pokeya.tanggu.service.biz;

import com.pokeya.tanggu.service.acl.SchoolAdminService;
import com.pokeya.tanggu.service.acl.SchoolService;
import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import com.pokeya.tanggu.service.dto.SchoolDto;
import com.pokeya.tanggu.service.dto.SchoolInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolBiz {

    private final SchoolService schoolService;
    private final SchoolAdminService schoolAdminService;

    public List<SchoolDto> getSchoolList(Long userId) {
        return schoolService.getSchoolList(userId);
    }

    public SchoolDto getSchoolById(Long schoolId) {
        return schoolService.getSchoolById(schoolId);
    }

    public Long saveSchoolInfo(SchoolInfoDto schoolInfoDto) {
        Long schoolId = schoolService.saveSchool(schoolInfoDto.getSchoolDto());
        SchoolAdminDto schoolAdminDto = schoolInfoDto.getSchoolAdminDto();
        schoolAdminDto.setSchoolId(schoolId);
        //todo
        var userId = 1L;
        schoolAdminDto.setUserId(userId);
        schoolAdminService.saveSchoolAdmin(schoolAdminDto);
        return schoolId;
    }
}
