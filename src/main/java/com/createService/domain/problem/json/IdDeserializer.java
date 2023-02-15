package com.createService.domain.problem.json;

import com.createService.domain.common.exceptions.RuntimeInvalidInputException;
import com.createService.domain.common.models.Id;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class IdDeserializer extends StdDeserializer<Id> {

    protected IdDeserializer() {
        this(null);
    }

    @Override
    public Id deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        try {
            return new Id(jsonParser.getValueAsString());
        }
        catch (Exception e) {
            throw new RuntimeInvalidInputException(e.getMessage());
        }
    }

    protected IdDeserializer(Class<?> t) {
        super(t);
    }


}
