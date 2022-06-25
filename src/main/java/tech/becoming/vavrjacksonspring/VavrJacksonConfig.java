package tech.becoming.vavrjacksonspring;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VavrJacksonConfig {

    @Bean
    @ConditionalOnMissingBean
    public VavrJacksonModule getVavrJacksonModule() {
        return new VavrJacksonModule();
    }

}
