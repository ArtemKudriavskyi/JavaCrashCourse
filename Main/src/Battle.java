package com.company.crashCourse.Battle;

public class Battle {
    public static boolean fight(Army army1, Army army2){

        while (army1.army.size()>0 && army2.army.size()>0){

            WarGame.fight(army1.army.get(0),army2.army.get(0));
            if (!army1.army.get(0).isAlive()){
                army1.army.remove(0);
            }
            if (!army2.army.get(0).isAlive()){
                army2.army.remove(0);
            }
        }


        System.out.println(army1.toString());
        System.out.println(army2.toString());

        return army1.army.size()>0;
    }
}
