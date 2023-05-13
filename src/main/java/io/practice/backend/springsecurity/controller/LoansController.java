package io.practice.backend.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoansController {

    @GetMapping(value = "/loans")
    public ResponseEntity<String> getLoansDetails() {
        return new ResponseEntity<>("loan details", HttpStatus.OK);
    }
}
