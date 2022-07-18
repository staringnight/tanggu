package com.pokeya.tanggu.infrastructure.model;

/**
 * 城市
 */
public class City {
    /**
     * 省市id
     */
    private Integer id;

    /**
     * 省市名称
     */
    private String name;

    /**
     * 隶属id -1为顶层
     */
    private Integer subCid;

    /**
     * 城市类型0国家,10省,20市,30区,40村街道
     */
    private Integer ctype;

    /**
     * 城市简拼
     */
    private String pinJ;

    /**
     * 城市全拼
     */
    private String pinA;

    /**
     * 城市状态
     */
    private Integer cstate;

    /**
     * 城市全拼空格间隔
     */
    private String pinAs;

    /**
     * 省份和直辖市的简称
     */
    private String shortname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSubCid() {
        return subCid;
    }

    public void setSubCid(Integer subCid) {
        this.subCid = subCid;
    }

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getPinJ() {
        return pinJ;
    }

    public void setPinJ(String pinJ) {
        this.pinJ = pinJ;
    }

    public String getPinA() {
        return pinA;
    }

    public void setPinA(String pinA) {
        this.pinA = pinA;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public String getPinAs() {
        return pinAs;
    }

    public void setPinAs(String pinAs) {
        this.pinAs = pinAs;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
}