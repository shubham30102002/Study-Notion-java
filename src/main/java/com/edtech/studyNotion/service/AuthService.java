package com.edtech.studyNotion.service;

import com.edtech.studyNotion.dto.auth.AuthRequestDto;
import com.edtech.studyNotion.dto.auth.AuthResponseDto;

public interface AuthService {
    AuthResponseDto login(AuthRequestDto request);
}
