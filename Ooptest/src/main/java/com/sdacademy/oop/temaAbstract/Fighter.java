package com.sdacademy.oop.temaAbstract;

public class Fighter {
    private int life;
    private String power;

    public Fighter(int life, String power) {
        this.life = life;
        this.power = power;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return power;
    }

    public void decreaseLife(int power) {
        this.life = getLife() - power;
    }

    public void attack(Fighter f, int power) {
        f.decreaseLife(power);
    }

}
