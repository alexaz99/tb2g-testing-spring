package org.springframework.samples.petclinic.yannylaurelbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {

    /**
     * Method to create and wire a new bean HearingInterpreter
     * by wiring WordProducer bean implementation
     */
    @Bean
    HearingInterpreter hearingInterpreter(WordProducer wordProducer) {
        return new HearingInterpreter(wordProducer);
    }
}
