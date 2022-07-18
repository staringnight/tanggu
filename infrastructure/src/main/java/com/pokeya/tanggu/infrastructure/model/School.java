package com.pokeya.tanggu.infrastructure.model;

import java.time.LocalDateTime;

/**
 * 学校
 */
public class School {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSchoolPermit() {
        return schoolPermit;
    }

    public void setSchoolPermit(String schoolPermit) {
        this.schoolPermit = schoolPermit;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getSchoolNature() {
        return schoolNature;
    }

    public void setSchoolNature(String schoolNature) {
        this.schoolNature = schoolNature;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLearningPeriod() {
        return learningPeriod;
    }

    public void setLearningPeriod(String learningPeriod) {
        this.learningPeriod = learningPeriod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}