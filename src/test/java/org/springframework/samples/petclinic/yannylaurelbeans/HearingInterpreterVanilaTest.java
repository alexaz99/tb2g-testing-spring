package org.springframework.samples.petclinic.yannylaurelbeans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit 4 test case.
 * Plain vanilla HearingInterpreterTest without Spring framework wiring
 * and without using Spring Context.
 * Next step is to write a testcase to use Spring Context to inject beans
 */
public class HearingInterpreterVanilaTest {

    HearingInterpreter hearingInterpreter;

    @Before
    public void setUp() throws Exception {
        hearingInterpreter = new HearingInterpreter(new LaurelWordProducer());
    }

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();;
        assertEquals("Laurel", word);
    }

}