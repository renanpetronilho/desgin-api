package io.platformbuilders.apidesign.api.impl;

import io.platformbuilders.apidesign.api.spec.ContactApiDefinition;
import io.platformbuilders.apidesign.dto.CreateContactRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactApi implements ContactApiDefinition {

    @PostMapping("/me/accounts/contacts")
    public ResponseEntity<Void> createContact(@RequestBody CreateContactRequest request) {
        return null;
    }
}
