package com.fun.bday.scheduler;

import com.fun.bday.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TokenExpiryScheduler {

    @Autowired
    private TokenService tokenService;

    @Scheduled(fixedRate = 300000L)
    public void deleteOldToken() {
        log.info("Running token expiry scheduler");
        this.tokenService.expireToken();
    }
}
