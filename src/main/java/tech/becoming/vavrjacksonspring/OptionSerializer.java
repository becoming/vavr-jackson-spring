package tech.becoming.vavrjacksonspring;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.vavr.control.Option;
import io.vavr.control.Try;

public class OptionSerializer extends StdSerializer<Option<?>> {

    public OptionSerializer(JavaType type) {
        super(type);
    }

    @Override
    public void serialize(Option<?> value,
                          JsonGenerator jgen,
                          SerializerProvider provider) {

        value.toTry().andThenTry(jgen::writeObject).get();
    }

}
