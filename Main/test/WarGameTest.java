package com.company.crashCourse;

import com.company.crashCourse.Battle.Knight;
import com.company.crashCourse.Battle.WarGame;
import com.company.crashCourse.Battle.Warrior;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarGameTest {

    @Test
    void fight() {
        Warrior chuck = new Warrior();
        Warrior bruce = new Warrior();
        Warrior carl = new Knight();
        Warrior dave = new Warrior();

        boolean result1= WarGame.fight(chuck,bruce);
        boolean result2= WarGame.fight(dave,carl);

        assertTrue(result1,"Chuck should won");
        assertFalse(result2,"Dave should lost");

        assertTrue(chuck.isAlive(),"chuck should be alive");
        assertFalse(bruce.isAlive(),"bruce should not be alive");
        assertTrue(carl.isAlive(),"carl should be alive");
        assertFalse(dave.isAlive(),"bruce should not be alive");
    }
}
