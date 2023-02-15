package com.createService.domain.common.models;

import com.createService.domain.common.exceptions.InvalidInputException;

import java.time.ZonedDateTime;
import java.util.Objects;

public class DateTime {

    private ZonedDateTime dateTime;

    public DateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public DateTime(String value) throws InvalidInputException {
        try {
            this.dateTime = ZonedDateTime.parse(value);
        }
        catch (Exception e) {
            throw new InvalidInputException("Invalid date: " + value);
        }
    }


    public static DateTime now() {
        return new DateTime(ZonedDateTime.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateTime dateTime1 = (DateTime) o;
        return Objects.equals(dateTime, dateTime1.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime);
    }
}
