package com.fun.bday.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TokenService {

    private String token = null;

    public String getToken() {
        if (this.token == null) {
            token = UUID.randomUUID().toString();
        }

        return token;
    }

    public void expireToken() {
        this.token = null;
    }
}
