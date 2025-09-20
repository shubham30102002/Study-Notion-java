package com.edtech.studyNotion.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDto implements Serializable {
    private String accessToken; // JWT
    private String tokenType = "Bearer";
    private Long expiresInSeconds;
    private Dtos.UserDto user;
}


