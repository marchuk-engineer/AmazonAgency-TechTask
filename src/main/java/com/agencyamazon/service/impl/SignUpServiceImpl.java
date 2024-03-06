package com.agencyamazon.service.impl;

import com.agencyamazon.api.dto.RegistrationUserDto;
import com.agencyamazon.entity.User;
import com.agencyamazon.repository.UserRepository;
import com.agencyamazon.service.SignUpService;
import com.agencyamazon.exception.UserAlreadyExistAuthenticationException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void addUser(RegistrationUserDto dto) {
        Optional<User> user = userRepository.findByUsername(dto.getUsername());
        user.ifPresentOrElse(
                u -> {
                    throw new UserAlreadyExistAuthenticationException("User already exists with username: " + dto.getUsername());
                },
                () -> userRepository.save(User.builder()
                        .id(UUID.randomUUID())
                        .username(dto.getUsername())
                        .password(passwordEncoder.encode(dto.getPassword()))
                        .build())
        );
    }

}
