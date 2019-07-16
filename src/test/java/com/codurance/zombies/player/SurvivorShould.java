package com.codurance.zombies.player;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.Is.is;

public class SurvivorShould {
    @Test
    public void mustBornHealthy() {
        Survivor survivor = new Survivor("Juan");
        assertThat(survivor.getWounds(), is(0));
        survivor.wound();
        assertThat(survivor.getWounds(), is(1));
    }

    @Test
    public void must_die_when_recive_2_wound() {
        Survivor survivor = new Survivor("Juan");
        survivor.wound();
        assertThat(survivor.isAlive(), is(true));

    }
}
