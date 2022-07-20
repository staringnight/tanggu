package com.pokeya.tanggu.infrastructure.mapper;

import com.pokeya.tanggu.infrastructure.model.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> selectByUserId(@Param("userId") Long userId);
}