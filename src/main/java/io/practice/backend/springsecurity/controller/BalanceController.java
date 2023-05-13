package io.practice.backend.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BalanceController {

    @GetMapping(value = "/balance")
    public ResponseEntity<String> getBalanceDetails() {
        return new ResponseEntity<>("balance details", HttpStatus.OK);
    }
}