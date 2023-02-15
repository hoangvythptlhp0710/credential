package com.createService.infrastructure.share.controllers;

import com.createService.domain.common.exceptions.BusinessLogicException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ControllerHandler {

    @NoArgsConstructor
    public static class Result {
        public String message;
        private Object code;

        public Result(String message, Object code) {
            this.message = message;
            this.code = code;
        }
    }

    @FunctionalInterface
    public static interface Runnable {
        public Result run() throws BusinessLogicException;
    }

    public static ResponseEntity<?> handle(Runnable runner) {
        try {
            Result result = runner.run();
            return new ResponseEntity<>(
                    new ResponseBody(result.message, result.code),
            HttpStatus.OK
            );
        } catch (BusinessLogicException e) {
            throw new RuntimeException(e);
        }
    }
}
