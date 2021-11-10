package com.company.crashCourse.Battle;

public class Warrior {
    private int health;
    private int attack;

    public Warrior(){
        this(50,5);
    }

    protected Warrior(int health, int attack){
        this.health = health;
        this.attack = attack;
    }

    public boolean isAlive(){
        return health>0;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void hits(Warrior defender) {
        defender.getDamage(attack);
    }

    private void getDamage(int damage) {
        health -= damage;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "health=" + health +
                ", attack=" + attack +
                "}\n";
    }

}
