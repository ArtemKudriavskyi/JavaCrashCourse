package com.company.crashCourse.Battle;

import java.util.ArrayList;
import java.util.List;

public class Army  {
    List<Warrior> army = new ArrayList();

    
    public void addUnits(Warrior war, int count) {
        String className = war.getClass().getSimpleName();

        System.out.println("имя класса: " + className);

        for (int i = 0; i < count; i++) {
//            Warrior warrior = new Warrior(war.getHealth(), war.getAttack());
            if (className.equals("Warrior")) {
                army.add(new Warrior());
            }else {
                army.add(new Knight());
            }

        }
    }

    @Override
    public String toString() {
        return "Army{\n" +
                army +
                "}";
    }
}
