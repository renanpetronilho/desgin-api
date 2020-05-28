package io.platformbuilders.apidesign.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Model para criar um contato")
public class CreateContactRequest {

    @ApiModelProperty(value = "código do banco", example = "111", position = 1)
    private String bankCode;

    @ApiModelProperty(value = "CPF/CNPJ do contato", example = "27762639373", position = 2)
    private String document;

    @ApiModelProperty(value = "Nome do contato", example = "Maria Luiza", position = 3)
    private String name;

    @ApiModelProperty(value = "Numero da conta", example = "01020304-00", position = 4)
    private String conta;

    @ApiModelProperty(value = "Numero da Agencia", example = "010203", position = 5)
    private String agencia;

    @ApiModelProperty(value = "Tipo da conta", example = "CONTA_CORRENTE", position = 6)
    private ContactType type;
}
