package com.pokeya.tanggu.infrastructure.repository;

import cn.hutool.core.lang.Snowflake;
import com.pokeya.tanggu.infrastructure.converter.SchoolAdminConverter;
import com.pokeya.tanggu.infrastructure.mapper.SchoolAdminMapper;
import com.pokeya.tanggu.infrastructure.model.SchoolAdmin;
import com.pokeya.tanggu.service.acl.SchoolAdminService;
import com.pokeya.tanggu.service.dto.SchoolAdminDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class SchoolAdminRepository implements SchoolAdminService {
    private final SchoolAdminMapper schoolAdminMapper;
    private final Snowflake snowflake;

    @Override
    public SchoolAdminDto getSchoolInfoById(Long schoolAdminId) {
        SchoolAdmin schoolAdmin = schoolAdminMapper.selectByPrimaryKey(schoolAdminId);
        return SchoolAdminConverter.INSTANCES.sourceToTarget(schoolAdmin);
    }

    @Override
    public List<SchoolAdminDto> getSchoolAdminInfoBySchoolId(Long schoolId) {
        List<SchoolAdmin> schoolAdminList = schoolAdminMapper.getSchoolAdminInfoBySchoolId(schoolId);
        return SchoolAdminConverter.INSTANCES.sourceToTarget(schoolAdminList);
    }

    @Override
    public Long saveSchoolAdmin(SchoolAdminDto schoolAdminDto) {
        SchoolAdmin schoolAdmin = SchoolAdminConverter.INSTANCES.targetToSource(schoolAdminDto);
        if (schoolAdmin.getId() == null) {
            schoolAdmin.setId(snowflake.nextId());
            schoolAdminMapper.insertSelective(schoolAdmin);
        } else {
            schoolAdminMapper.updateByPrimaryKeySelective(schoolAdmin);
        }
        return schoolAdmin.getId();
    }
}
