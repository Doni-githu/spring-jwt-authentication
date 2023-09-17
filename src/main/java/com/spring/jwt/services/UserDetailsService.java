package com.spring.jwt.services;

import java.util.Optional;

import com.spring.jwt.entities.User;

public interface UserDetailsService extends org.springframework.security.core.userdetails.UserDetailsService {
    Optional<User> findByUserNme(String username);
}
