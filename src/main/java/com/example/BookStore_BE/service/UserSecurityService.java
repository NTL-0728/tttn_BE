package com.example.BookStore_BE.service;

import com.example.BookStore_BE.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserSecurityService extends UserDetailsService {
    public User findByUsername(String username);
}
