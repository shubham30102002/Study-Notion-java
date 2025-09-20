package com.edtech.studyNotion.service.impl;

import com.edtech.studyNotion.dto.auth.AuthRequestDto;
import com.edtech.studyNotion.dto.auth.AuthResponseDto;
import com.edtech.studyNotion.service.AuthService;
import com.edtech.studyNotion.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public class AuthServiceImpl implements AuthService {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtils jwtUtils;


    @Override
    public AuthResponseDto login(AuthRequestDto request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsernameOrEmail(), request.getPassword())
        );

        String token = jwtUtils.generateToken(authentication.getName());

        return AuthResponseDto.builder()
                .accessToken(token)
                .expiresInSeconds(3600L)
                .build();
    }
}
