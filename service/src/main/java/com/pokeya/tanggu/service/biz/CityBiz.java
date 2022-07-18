package com.pokeya.tanggu.service.biz;

import com.pokeya.tanggu.service.acl.CityService;
import com.pokeya.tanggu.service.bo.CityBo;
import com.pokeya.tanggu.service.dto.CityItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author mac
 */
@Service
@RequiredArgsConstructor
public class CityBiz {
    private final CityService cityService;

    public List<CityItem> getAllCityList() {
        List<CityBo> allCityList = cityService.getAllCityList();
        Map<Integer, List<CityBo>> collect = allCityList.stream().collect(Collectors.groupingBy(CityBo::getSubCid));
        List<CityItem> cityItemList = new ArrayList<>();
        for (CityBo cityBo : collect.get(0)) {
            List<CityItem> temp = new ArrayList<>();
            CityItem item = new CityItem(cityBo.getId().toString(), cityBo.getName(), cityBo.getCtype(), cityBo.getPinJ(), temp);
            cityItemList.add(item);
            handlerCityList(item, collect);
        }
        return cityItemList;
    }

    private void handlerCityList(CityItem item, Map<Integer, List<CityBo>> collect) {
        List<CityItem> childrenList = item.children();
        List<CityBo> cityBoList = collect.get(Integer.parseInt(item.value()));
        if (!CollectionUtils.isEmpty(cityBoList)) {
            for (CityBo cityBo : cityBoList) {
                List<CityItem> temp = new ArrayList<>();
                CityItem children = new CityItem(cityBo.getId().toString(), cityBo.getName(), cityBo.getCtype(), cityBo.getPinJ(), temp);
                childrenList.add(children);
                handlerCityList(children, collect);
            }
        }
    }
}
