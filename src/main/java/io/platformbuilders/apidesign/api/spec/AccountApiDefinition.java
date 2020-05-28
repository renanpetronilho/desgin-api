package io.platformbuilders.apidesign.api.spec;

import io.platformbuilders.apidesign.dto.AccountResponse;
import io.platformbuilders.apidesign.dto.ErroInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api(value = "API referente ao conta", tags = {"ACCOUNT"})
public interface AccountApiDefinition {

    @ApiOperation(value = "Recuperar dados da minha conta", response = AccountResponse.class)
    @ApiResponses({
            @ApiResponse(code = 401, message = "Não autorizado", response = ErroInfo.class),
            @ApiResponse(code = 403, message = "Proibido acesso", response = ErroInfo.class),
            @ApiResponse(code = 500, message = "Erro de servidor", response = ErroInfo.class)
    })
    ResponseEntity<AccountResponse> getMyAccount();
}
