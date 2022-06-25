package tech.becoming.vavrjacksonspring;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;

class VavrJacksonModule extends Module {
    @Override
    public String getModuleName() {
        return "becoming-vavr-jackson-spring";
    }

    @Override
    public Version version() {
        return new Version(0, 0, 1, "", null, null);
    }

    @Override
    public void setupModule(SetupContext context) {
        context.addSerializers(new VavrJacksonSerializerBase());
    }
}
