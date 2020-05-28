package io.platformbuilders.apidesign.api.spec;

import io.platformbuilders.apidesign.dto.CardResponse;
import io.platformbuilders.apidesign.dto.ErroInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api(value = "API referente aos cartões", tags = {"CARD"})
public interface CardApiDefinition {

    @ApiOperation(value = "Recuperar cartão", response = CardResponse.class)
    @ApiResponses({
            @ApiResponse(code = 404, message = "Cartão não encontrado", response = ErroInfo.class),
            @ApiResponse(code = 500, message = "Erro de servidor", response = ErroInfo.class)
    })
    ResponseEntity<CardResponse> getCard();
}
