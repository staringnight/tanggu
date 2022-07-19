package com.pokeya.tanggu.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description ="省市区")
public record CityItem(@Schema(description ="值id") String value, @Schema(description ="name") String label,
                       @Schema(description ="城市类型0国家,10省,20市,30区,40村街道") Integer ctype, @Schema(description ="城市简拼") String pin_j,
                       @Schema(description ="省市区list") List<CityItem> children) {
}
