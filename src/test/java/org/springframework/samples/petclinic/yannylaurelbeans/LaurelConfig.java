package org.springframework.samples.petclinic.yannylaurelbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LaurelConfig {

    /**
     * Create a WordProducer bean
     */
    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}
