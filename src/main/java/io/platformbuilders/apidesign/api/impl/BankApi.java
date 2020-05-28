package io.platformbuilders.apidesign.api.impl;

import io.platformbuilders.apidesign.api.spec.BankApiDefinition;
import io.platformbuilders.apidesign.dto.BankResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankApi implements BankApiDefinition {

    @GetMapping("/banks")
    public ResponseEntity<List<BankResponse>> getAllBanks(@RequestParam  Integer page, @RequestParam Integer size,
                                                          @RequestParam(required = false) String name) {
        return null;
    }
}
