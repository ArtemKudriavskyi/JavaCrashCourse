package com.company.crashCourse.Battle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @Test
    void fight(){

        Warrior warrior = new Warrior();
        Warrior knight = new Knight();



        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,1);
            army2.addUnits(warrior,2);

            assertFalse(Battle.fight(army1,army2),"army2 should won");
        }

        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,2);
            army2.addUnits(warrior,3);

            assertFalse(Battle.fight(army1,army2),"army2 should won");
        }

        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,5);
            army2.addUnits(warrior,7);

            assertFalse(Battle.fight(army1,army2),"army2 should won");
        }

        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,20);
            army2.addUnits(warrior,21);

            assertTrue(Battle.fight(army1,army2),"army22 should won");
        }

        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,10);
            army2.addUnits(warrior,11);

            assertTrue(Battle.fight(army1,army2),"army2 should won");
        }

        {
            Army army1 = new Army();
            Army army2 = new Army();

            army1.addUnits(warrior,11);
            army2.addUnits(warrior,7);

            assertTrue(Battle.fight(army1,army2),"army2 should won");
        }
    }
}