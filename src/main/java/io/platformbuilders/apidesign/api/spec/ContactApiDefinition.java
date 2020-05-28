package io.platformbuilders.apidesign.api.spec;

import io.platformbuilders.apidesign.dto.CreateContactRequest;
import io.platformbuilders.apidesign.dto.ErroInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api(value = "API referente ao contato", tags = {"ACCOUNT"})
public interface ContactApiDefinition {


    @ApiOperation(value = "Cria contato dentro da conta")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Contato criado com sucesso"),
            @ApiResponse(code = 401, message = "Não autorizado", response = ErroInfo.class),
            @ApiResponse(code = 403, message = "Proibido acesso", response = ErroInfo.class),
            @ApiResponse(code = 409, message = "Contato ja existe", response = ErroInfo.class),
            @ApiResponse(code = 500, message = "Erro de servidor", response = ErroInfo.class)
    })
    ResponseEntity<Void> createContact(@ApiParam(value = "Dados de criacao do contato") CreateContactRequest request);

}
