package com.agencyamazon.service;

import com.agencyamazon.api.dto.SignInDto;
import jakarta.servlet.http.HttpServletResponse;

public interface SignInService {
    boolean login(SignInDto dto, HttpServletResponse response);
}
