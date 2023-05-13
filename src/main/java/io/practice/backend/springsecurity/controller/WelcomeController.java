package io.practice.backend.springsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/welcome")
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcomeUnauthenticatedUser() {
        String greeting = "Welcome to spring with security";
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
 }
