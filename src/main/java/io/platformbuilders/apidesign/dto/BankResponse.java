package io.platformbuilders.apidesign.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Dados de bancos")
public class BankResponse {

    @ApiModelProperty(value = "Nome do banco", example = "AllyaBank", position = 1)
    private String name;

    @ApiModelProperty(value = "Código do banco", example = "111", position = 2)
    private String code;
}
