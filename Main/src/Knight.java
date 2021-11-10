package com.company.crashCourse.Battle;

public class Knight extends Warrior {
    public Knight(){
        super(50,7);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "health=" + getHealth() +
                ", attack=" + getAttack() +
                "}\n";
    }
}
