package org.springframework.samples.petclinic.yannylaurelbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * For now, because we have 2 implementation of WordProducer, set one as a primary bean.
 * Need for wiring for the context
 */
@Component
@Primary
public class LaurelWordProducer implements WordProducer {

    @Override
    public String getWord() {
        return "Laurel";
    }
}
