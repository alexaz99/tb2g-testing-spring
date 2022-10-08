package org.springframework.samples.petclinic.yannylaurelbeans;

import org.springframework.stereotype.Service;

/**
 * This is a consumer of the Producer
 * Declare as @Service and Spring declared as a Component
 */
@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    /**
     * Pass a generic WordProducer interface in constructor for wiring
     * @param wordProducer
     */
    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIheard() {
        return wordProducer.getWord();
    }
}
