package tech.becoming.vavrjacksonspring;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.vavr.control.Option;
import io.vavr.control.Try;

class VavrJacksonSerializerBase extends Serializers.Base {
    @Override
    public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
        Class<?> raw = type.getRawClass();

        if (Try.class.isAssignableFrom(raw)) {
            return new TrySerializer(type);
        }
        else if (Option.class.isAssignableFrom(raw)) {
            return new OptionSerializer(type);
        }

        return super.findSerializer(config, type, beanDesc);
    }
}
