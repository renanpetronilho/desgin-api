package io.platformbuilders.apidesign.api.impl;

import io.platformbuilders.apidesign.api.spec.AccountApiDefinition;
import io.platformbuilders.apidesign.dto.AccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountApi  implements AccountApiDefinition {

    @GetMapping("/me/accounts")
    public ResponseEntity<AccountResponse> getMyAccount() {
        return null;
    }
}
