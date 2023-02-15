package com.createService.domain.problem.model;

import com.createService.domain.common.exceptions.InvalidInputException;

public enum ProgrammingLanguage {
    JAVA, JAVASCRIPT, CPLUSPLUS, PYTHON;

    public static ProgrammingLanguage from(String val) throws InvalidInputException {
        switch (val) {
            case "JAVA" -> {
                return JAVA;
            }
            case "JAVASCRIPT" -> {
                return JAVASCRIPT;
            }
            case "CPLUSPLUS" -> {
                return CPLUSPLUS;
            }
            case "PYTHON" -> {
                return PYTHON;
            }
            default -> {
                throw new InvalidInputException("Invalid programming language, valid" + "values are: [JAVA, JAVASCRIPT, CPLUSPLUS, PYTHON]");
            }
        }
    }
}
