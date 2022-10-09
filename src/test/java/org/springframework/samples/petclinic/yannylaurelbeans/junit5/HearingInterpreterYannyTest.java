package org.springframework.samples.petclinic.yannylaurelbeans.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.yannylaurelbeans.BaseConfig;
import org.springframework.samples.petclinic.yannylaurelbeans.HearingInterpreter;
import org.springframework.samples.petclinic.yannylaurelbeans.YannyConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(classes = {BaseConfig.class, YannyConfig.class})
class HearingInterpreterYannyTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Yanny", word);
    }
}