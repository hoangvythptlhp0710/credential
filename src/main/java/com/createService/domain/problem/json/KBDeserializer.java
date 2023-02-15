package com.createService.domain.problem.json;

import com.createService.domain.common.exceptions.InvalidInputException;
import com.createService.domain.common.exceptions.RuntimeInvalidInputException;
import com.createService.domain.common.models.Id;
import com.createService.domain.problem.model.KB;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class KBDeserializer extends StdDeserializer<KB> {
    protected KBDeserializer(Class<?> vc) {
        super(vc);
    }

    protected KBDeserializer(){
        this(null);
    }

    @Override
    public KB deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        return new KB(jsonParser.getValueAsDouble());
    }
}
