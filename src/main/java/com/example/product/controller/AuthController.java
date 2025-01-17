package com.example.product.controller;

import java.util.Collections;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.User;
import com.example.product.security.JwtUtil;

@RestController
public class AuthController {
    
    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        // For demo purposes, accept any username/password
        String token = jwtUtil.generateToken(user.getUsername());
        return ResponseEntity.ok().body(Collections.singletonMap("token", token));
    }
}