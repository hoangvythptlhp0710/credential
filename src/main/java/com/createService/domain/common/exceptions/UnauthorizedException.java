package com.createService.domain.common.exceptions;

public class UnauthorizedException extends RuntimeException{

    private String code;

    public UnauthorizedException(String message) {
        super(message);
    }

}
