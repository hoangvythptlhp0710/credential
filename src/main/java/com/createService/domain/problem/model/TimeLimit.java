package com.createService.domain.problem.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

public class TimeLimit {

    private ProgrammingLanguage programmingLanguage;
    private Millisecond timeLimit;

    public TimeLimit(){

    }

    public TimeLimit(ProgrammingLanguage programmingLanguage, Millisecond timeLimit) {
        this.programmingLanguage = programmingLanguage;
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return "TimeLimit{" +
                "programmingLanguage=" + programmingLanguage +
                ", timeLimit=" + timeLimit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeLimit timeLimit1 = (TimeLimit) o;
        return programmingLanguage == timeLimit1.programmingLanguage && Objects.equals(timeLimit, timeLimit1.timeLimit);
    }



    @Override
    public int hashCode() {
        return Objects.hash(programmingLanguage, timeLimit);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    public static class CreateInputTL {
        public ProgrammingLanguage programmingLanguage;
        public TimeLimit timeLimit;
    }

    public Millisecond getTimeLimit() {
        return timeLimit;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setTimeLimit(Millisecond timeLimit) {
        this.timeLimit = timeLimit;
    }
}
