package com.pokeya.tanggu.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SchoolDto {

    /**
     * 主键
     */
    private Long id;

    /**
     * 学校全称
     */
    private String name;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 办学许可证
     */
    private String schoolPermit;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 办学性质
     */
    private String schoolNature;

    /**
     * 等级评定
     */
    private String rating;

    /**
     * 学段  幼儿园  kindergarten 小学 primarySchool 初中 juniorHighSchool 高中 seniorHighSchool
     */
    private String learningPeriod;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 省id
     */
    private Integer provinceId;

    /**
     * 市id
     */
    private Integer cityId;

    /**
     * 区id
     */
    private Integer areaId;

    /**
     * 认证失败理由
     */
    private String refuseReason;

    /**
     * 状态,0 默认，1认证通过 2认证失败 3 初始化成功
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}
