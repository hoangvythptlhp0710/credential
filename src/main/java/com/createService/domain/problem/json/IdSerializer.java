package com.createService.domain.problem.json;

import com.createService.domain.common.models.Id;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class IdSerializer extends StdSerializer<Id> {

    public IdSerializer() {
        this(null);
    }
    public IdSerializer(Class<Id> t) {
        super(t);
    }
    @Override
    public void serialize(Id id, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(id.toString());
    }
}
