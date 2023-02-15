package com.createService.domain.problem.model;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class MemoryLimit {
    private ProgrammingLanguage programmingLanguage;
    private KB memoryLimit;

    public MemoryLimit(){

    }

    public MemoryLimit(ProgrammingLanguage programmingLanguage, KB memoryLimit) {
        this.programmingLanguage = programmingLanguage;
        this.memoryLimit = memoryLimit;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateInputML {
        public ProgrammingLanguage programmingLanguage;
        public MemoryLimit memoryLimit;
    }
}
