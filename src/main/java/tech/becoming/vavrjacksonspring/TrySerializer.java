package tech.becoming.vavrjacksonspring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.vavr.control.Try;

import java.io.IOException;

public class TrySerializer extends StdSerializer<Try<?>> {

    public TrySerializer(JavaType type) {
        super(type);
    }

    @Override
    public void serialize(Try<?> value,
                          JsonGenerator jgen,
                          SerializerProvider provider) throws IOException {

        if(value.isFailure()) {
            throw new IOException(value.getCause());
        }

        jgen.writeObject(value.get());
    }

}
