package com.pokeya.tanggu.service.bo;

import lombok.Data;

@Data
public class CityBo {
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
}
