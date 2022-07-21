package com.fun.bday.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RuntimeExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ExceptionObject> runtimeExceptionHandler(Exception exception) {
        return new ResponseEntity<>(
                new ExceptionObject().toBuilder()
                        .message(exception.getMessage())
                        .type("Internal server Error !")
                        .build(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }
}
