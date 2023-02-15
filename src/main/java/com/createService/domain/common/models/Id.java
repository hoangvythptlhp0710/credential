package com.createService.domain.common.models;

import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.problem.json.IdDeserializer;
import com.createService.domain.problem.json.IdSerializer;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.bson.types.ObjectId;

import java.util.Objects;

@JsonSerialize(using = IdSerializer.class)
@JsonDeserialize(using = IdDeserializer.class)
public class Id {

    private String value;

    public Id(String value) throws InvalidInputException {
        if (!ObjectId.isValid(value)) {
            throw new InvalidInputException("Invalid Id: " + value);
        }
        this.value = value;
    }

    @Override
    public String toString() {
        return "Id{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id id = (Id) o;
        return Objects.equals(value, id.value);
    }

    public static Id generateRandom() {
        try {
            return new Id(new ObjectId().toString());
        }
        catch (Exception e) {
            return null;
        }
    }

}
