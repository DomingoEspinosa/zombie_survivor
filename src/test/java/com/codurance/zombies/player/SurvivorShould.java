package com.codurance.zombies.player;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SurvivorShould {
    @Test
    public void mustBornHealthy() {
        Survivor survivor = new Survivor("Juan");
        int wounds = survivor.getWounds();
        assertThat(wounds, is(0));
    }
}
