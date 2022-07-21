package com.fun.bday.interceptor;

import com.fun.bday.service.TokenService;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Aspect
@Component
public class AuthInterceptor {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private TokenService tokenService;

    @Before("@annotation(RequiresAuthToken)")
    public void checkAuthToken() {
        checkToken();
    }

    private void checkToken() {
        if (httpServletRequest.getHeader("token") == null ||
                !tokenService.getToken().equals(httpServletRequest.getHeader("token"))) {
            throw new RuntimeException("Token invalid or missing !");
        }
    }
}
