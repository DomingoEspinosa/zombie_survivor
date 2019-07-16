package com.codurance.zombies.player;

import com.codurance.zombies.equipment.*;
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

    @Test
    public void have_a_equipment() {
        Survivor survivor = new Survivor("Juan");
        Equipment baseBallBat = new BaseBallBat();
        Equipment fryingPan = new FryingPan();
        Equipment katana = new Katana();
        Equipment pistol = new Pistol();
        Equipment water = new BottledWater();

        survivor.pickUpEquipment(baseBallBat);
        survivor.pickUpEquipment(fryingPan);
        survivor.pickUpEquipment(katana);
        survivor.pickUpEquipment(pistol);
        survivor.pickUpEquipment(water);

        assertThat(survivor.getNumEquipments(), is(5));
    }

    @Test
    public void have_a_equipment_in_hand() {
        Survivor survivor = new Survivor("Juan");
        Equipment baseBallBat = new BaseBallBat();
        Equipment fryingPan = new FryingPan();
        Equipment katana = new Katana();
        Equipment pistol = new Pistol();
        Equipment water = new BottledWater();

        survivor.pickUpEquipment(baseBallBat);
        survivor.pickUpEquipment(fryingPan);
        survivor.pickUpEquipment(katana);
        survivor.pickUpEquipment(pistol);
        survivor.pickUpEquipment(water);

        survivor.useEquipmentInHand(katana);
        survivor.useEquipmentInHand(pistol);

        assertThat(survivor.getNumEquipments(), is(5));
        assertThat(survivor.getElementsInHand(), is(2));
    }
}
