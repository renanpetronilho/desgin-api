package io.platformbuilders.apidesign.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Dados da conta")
public class AccountResponse {

    @ApiModelProperty(value = "Nome do(a) dono(a) da conta", example = "Paula Lacroix", position = 1)
    private String name;

    @ApiModelProperty(value = "Saldo em conta", example = "927.27", position = 2)
    private BigDecimal balance;

    @ApiModelProperty(value = "valor que usuario economizou(Econômetro)", example = "27.99", position = 3)
    private BigDecimal economy;
}
