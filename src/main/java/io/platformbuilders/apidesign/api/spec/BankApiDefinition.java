package io.platformbuilders.apidesign.api.spec;

import io.platformbuilders.apidesign.dto.BankResponse;
import io.platformbuilders.apidesign.dto.ErroInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Api(value = "API referente a banco", tags = {"BANK"})
public interface BankApiDefinition {


    @ApiOperation(value = "Listar bancos", response = BankResponse.class, notes = "lists")
    @ApiResponses({
            @ApiResponse(code = 4040, message = "Registro não encontrado", response = ErroInfo.class),
            @ApiResponse(code = 401, message = "Não autorizado", response = ErroInfo.class),
            @ApiResponse(code = 403, message = "Proibido acesso", response = ErroInfo.class),
            @ApiResponse(code = 500, message = "Erro de servidor", response = ErroInfo.class)
    })
    ResponseEntity<List<BankResponse>> getAllBanks(@ApiParam(value = "Pagina da pesquisa", example = "1") Integer page,
                                                   @ApiParam(value = "Quantidade de registros", example = "50") Integer size,
                                                   @ApiParam(value = "nome do banco", example = "AllyaBank") String name);
}
