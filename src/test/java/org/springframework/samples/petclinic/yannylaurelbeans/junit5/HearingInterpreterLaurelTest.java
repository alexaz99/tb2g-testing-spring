package org.springframework.samples.petclinic.yannylaurelbeans.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.yannylaurelbeans.BaseConfig;
import org.springframework.samples.petclinic.yannylaurelbeans.HearingInterpreter;
import org.springframework.samples.petclinic.yannylaurelbeans.LaurelConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

// below Junit5 @SpringJUnitConfig is a wrapper and has both
// @ExtendWith({SpringExtension.class}) and @ContextConfiguration
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterLaurelTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Laurel", word);
    }
}