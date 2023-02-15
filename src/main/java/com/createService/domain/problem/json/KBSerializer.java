package com.createService.domain.problem.json;

import com.createService.domain.common.models.Id;
import com.createService.domain.problem.model.KB;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class KBSerializer extends StdSerializer<KB> {
    @Override
    public void serialize(KB kb , JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNumber(kb.getValue());
    }

    public KBSerializer(Class<KB> t) {
        super(t);
    }

    public KBSerializer() {
        this(null);
    }
}
