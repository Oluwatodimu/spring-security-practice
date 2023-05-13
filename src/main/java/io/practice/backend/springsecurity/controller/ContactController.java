package io.practice.backend.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ContactController {

    @GetMapping(value = "/contact")
    public ResponseEntity<String> getContactDetails() {
        return new ResponseEntity<>("contact details", HttpStatus.OK);
    }
}
