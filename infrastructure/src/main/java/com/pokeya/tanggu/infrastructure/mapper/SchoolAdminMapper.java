package com.pokeya.tanggu.infrastructure.mapper;

import com.pokeya.tanggu.infrastructure.model.SchoolAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SchoolAdmin record);

    int insertSelective(SchoolAdmin record);

    SchoolAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SchoolAdmin record);

    int updateByPrimaryKey(SchoolAdmin record);

    List<SchoolAdmin> getSchoolAdminInfoBySchoolId(@Param("schoolId") Long schoolId);
}