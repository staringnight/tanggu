package com.pokeya.tanggu.infrastructure.repository;

import cn.hutool.core.lang.Snowflake;
import com.pokeya.tanggu.infrastructure.converter.SchoolConverter;
import com.pokeya.tanggu.infrastructure.mapper.SchoolMapper;
import com.pokeya.tanggu.infrastructure.model.School;
import com.pokeya.tanggu.service.acl.SchoolService;
import com.pokeya.tanggu.service.dto.SchoolDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class SchoolServiceRepository implements SchoolService {
    private final SchoolMapper schoolMapper;
    private final Snowflake snowflake;

    @Override
    public List<SchoolDto> getSchoolList(Long userId) {
        List<School> schoolList = schoolMapper.selectByUserId(userId);
        return SchoolConverter.INSTANCES.sourceToTarget(schoolList);
    }

    @Override
    public SchoolDto getSchoolById(Long schoolId) {
        School school = schoolMapper.selectByPrimaryKey(schoolId);
        return SchoolConverter.INSTANCES.sourceToTarget(school);
    }

    @Override
    public Long saveSchool(SchoolDto schoolDto) {
        School school = SchoolConverter.INSTANCES.targetToSource(schoolDto);
        if (school.getId() == null) {
            school.setId(snowflake.nextId());
            schoolMapper.insertSelective(school);
        } else {
            schoolMapper.updateByPrimaryKeySelective(school);
        }
        return school.getId();
    }
}
