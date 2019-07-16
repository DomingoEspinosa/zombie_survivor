package com.codurance.zombies.player;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SurvivorShould {
    @Test
    public void must_born_healthy() {
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
        survivor.wound();
        assertThat(survivor.isAlive(), is(false));

    }

    @Test
    public void have_3_turns_at_the_beginning() {
        Survivor survivor = new Survivor("Juan");
        assertThat(survivor.getTurns(), is(3));
    }
}
