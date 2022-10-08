package org.springframework.samples.petclinic.yannylaurelbeans;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * JUnit 4 test case.
 * Use Spring framework to wire Beans using Spring Context.
 * A testcase to use Spring Context to inject beans
 */
@RunWith(SpringRunner.class)
// @ContextConfiguration annotation will autowire with Laurel bean being injected.
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;


    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();;
        assertEquals("Laurel", word);
    }

}