package com.createService.domain.common.exceptions;

import org.springframework.http.HttpStatus;

public class RuntimeInvalidInputException extends RuntimeBusinessLogicException{


    public RuntimeInvalidInputException(String message) {
        super(message, String.valueOf(HttpStatus.BAD_REQUEST));
    }
}
