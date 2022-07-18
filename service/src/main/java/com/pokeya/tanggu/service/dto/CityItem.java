package com.pokeya.tanggu.service.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(title = "省市区")
public record CityItem(@Schema(title = "值id") String value, @Schema(title = "name") String label,
                       @Schema(title = "城市类型0国家,10省,20市,30区,40村街道") Integer ctype, @Schema(title = "城市简拼") String pin_j,
                       @Schema(title = "省市区list") List<CityItem> children) {
}
