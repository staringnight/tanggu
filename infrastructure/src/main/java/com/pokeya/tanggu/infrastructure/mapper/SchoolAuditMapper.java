package com.pokeya.tanggu.infrastructure.mapper;

import com.pokeya.tanggu.infrastructure.model.SchoolAudit;

public interface SchoolAuditMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SchoolAudit record);

    int insertSelective(SchoolAudit record);

    SchoolAudit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SchoolAudit record);

    int updateByPrimaryKey(SchoolAudit record);
}