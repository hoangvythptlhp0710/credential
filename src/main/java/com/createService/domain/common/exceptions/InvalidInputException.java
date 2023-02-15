package com.createService.domain.common.exceptions;

public class InvalidInputException extends BusinessLogicException {
    public InvalidInputException(String message) {
        super(message, "INVALID_INPUT");
    }
}
