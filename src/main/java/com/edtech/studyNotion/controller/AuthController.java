package com.edtech.studyNotion.controller;

import com.edtech.studyNotion.dto.auth.AuthRequestDto;
import com.edtech.studyNotion.dto.auth.AuthResponseDto;
import com.edtech.studyNotion.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;


    @PostMapping("/login")
    public ResponseEntity<AuthResponseDto> login(@Valid @RequestBody AuthRequestDto request){
        return ResponseEntity.ok(authService.login(request));
    }
}
