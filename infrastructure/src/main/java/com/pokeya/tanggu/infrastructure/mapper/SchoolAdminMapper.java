package com.pokeya.tanggu.infrastructure.mapper;

import com.pokeya.tanggu.infrastructure.model.SchoolAdmin;

public interface SchoolAdminMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SchoolAdmin record);

    int insertSelective(SchoolAdmin record);

    SchoolAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SchoolAdmin record);

    int updateByPrimaryKey(SchoolAdmin record);
}