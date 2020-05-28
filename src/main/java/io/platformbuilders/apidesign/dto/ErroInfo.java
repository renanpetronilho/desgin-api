package io.platformbuilders.apidesign.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Resposta de erro padrão")
public class ErroInfo {

    @ApiModelProperty(value = "mensagem de erro", example = "Mensagem de erro", position = 1)
    private String messages;
}
