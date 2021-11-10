package com.company.crashCourse.Battle;

import com.company.crashCourse.Battle.Warrior;

public class WarGame {

    public static boolean fight(Warrior warrior1, Warrior warrior2) { //by butrym
        Warrior attacker = warrior1;
        Warrior defender = warrior2;

        while (attacker.isAlive()){
            attacker.hits(defender);

            Warrior swap = attacker;
            attacker = defender;
            defender = swap;
        }

        return warrior1.isAlive();
    }


//    public static boolean fight(Warrior w1, Warrior w2) {     // при использовании надо
//                                                              // заменить поля health, attack на protected
//        int i = 1;
//        int switcher = 0;
//        while (w1.isAlive() && w2.isAlive()) {
//            System.out.println("round " + i);
//            System.out.println("start   w1 health: " + w1.health + "    w2 health: " + w2.health);
//            if (switcher == 0) {
//                w2.health -= w1.attack;
//                switcher = 1;
//            } else {
//                w1.health -= w2.attack;
//                switcher = 0;
//            }
//            System.out.println("finish  w1 health: " + w1.health + "    w2 health: " + w2.health + "\n\n");
//            i++;
//        }
//        return w1.isAlive();
//    }
//
//    public static boolean fight2(Warrior w1, Warrior w2) {   //за один ход бъют оба
//        int i = 0;
//        while (w1.isAlive() && w2.isAlive()) {
//            System.out.println("round " + i);
//            System.out.println("start   w1 health: " + w1.health + "    w2 health: " + w2.health);
//            w2.health -= w1.attack;
//            if (!w2.isAlive()) return w1.isAlive();
//            w1.health -= w2.attack;
//            System.out.println("finish  w1 health: " + w1.health + "    w2 health: " + w2.health + "\n\n");
//            i++;
//        }
//        return w1.isAlive();
//    }
//
//    public static boolean fakeFight(Warrior warrior1, Warrior warrior2) { //все остаются живы
//        int i = 1;
//        int switcher = 0;
//        Warrior w1 = new Warrior(warrior1.getHealth(), warrior1.getAttack());
//        Warrior w2 = new Warrior(warrior2.getHealth(), warrior2.getAttack());
//
//        while (w1.isAlive() && w2.isAlive()) {
//            System.out.println("round " + i);
//            System.out.println("start   w1 health: " + w1.health + "    w2 health: " + w2.health);
//            if (switcher == 0) {
//                w2.health -= w1.attack;
//                switcher = 1;
//            } else {
//                w1.health -= w2.attack;
//                switcher = 0;
//            }
//            System.out.println("finish  w1 health: " + w1.health + "    w2 health: " + w2.health + "\n\n");
//            i++;
//        }
//        return w1.isAlive();
//    }
}
