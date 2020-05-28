package io.platformbuilders.apidesign.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Dados do cartão")
public class CardResponse {

    @ApiModelProperty(value = "numero do cartão", example = "4929 2947 1804 6468", position = 1)
    private String number;

    @ApiModelProperty(value = "validade do cartão", example = "02/27", position = 2)
    private String expirationDate;
}
