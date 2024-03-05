package com.agencyamazon.service.impl;

import com.agencyamazon.api.dto.RegistrationUserDto;
import com.agencyamazon.entity.User;
import com.agencyamazon.repository.UserRepository;
import com.agencyamazon.service.SignUpService;
import exception.UserAlreadyExistAuthenticationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final UserRepository userRepository;

    @Override
    public void addUser(RegistrationUserDto dto) {
        Optional<User> user = userRepository.findByUsername(dto.getUsername());
        user.ifPresentOrElse(
                u -> {
                    throw new UserAlreadyExistAuthenticationException("User already exists with username: " + dto.getUsername());
                },
                () -> userRepository.save(User.builder()
                        .username(dto.getUsername())
                        .password(dto.getPassword())
                        .build())
        );
    }

}
