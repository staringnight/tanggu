package com.pokeya.tanggu.web.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author mac
 */
@Schema(description ="实体id请求")
public record EntityIdRequest(@NotEmpty @Schema(description ="id") Long id) implements Serializable {
}
