package com.pokeya.tanggu.service.biz;

import com.pokeya.tanggu.service.acl.SchoolAdminService;
import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolAdminBiz {
    private final SchoolAdminService schoolAdminService;

    public SchoolAdminDto getSchoolInfoById(Long schoolAdminId) {
        return schoolAdminService.getSchoolInfoById(schoolAdminId);
    }

    public List<SchoolAdminDto> getSchoolAdminInfoBySchoolId(Long schoolId) {
        return schoolAdminService.getSchoolAdminInfoBySchoolId(schoolId);
    }
}
