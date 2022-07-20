package com.pokeya.tanggu.service.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author mac
 */
@Data
public class SchoolInfoDto implements Serializable {
    private SchoolDto schoolDto;
    private SchoolAdminDto schoolAdminDto;
}
