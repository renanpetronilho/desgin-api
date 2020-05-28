package io.platformbuilders.apidesign.api.impl;

import io.platformbuilders.apidesign.api.spec.CardApiDefinition;
import io.platformbuilders.apidesign.dto.CardResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardApi implements CardApiDefinition {

    @GetMapping("/me/cards")
    public ResponseEntity<CardResponse> getCard() {
        return null;
    }
}
