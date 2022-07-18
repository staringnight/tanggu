package com.pokeya.tanggu.web.dto.response;

import com.pokeya.tanggu.service.dto.CityItem;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;
import java.util.List;

/**
 * @author mac
 */
@Schema(title = "城市信息")
public record CityResponse(@Schema(title = "城市列表") List<CityItem> cityItemList) implements Serializable {

}
