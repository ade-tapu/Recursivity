package com.sdacademy.oop.temaAbstract;

public class NonPlayerCharacter extends Fighter {
    public NonPlayerCharacter(int life, String power) {
        super(life, power);
    }
    @Override
    public void attack(Fighter f, int power){
        System.out.println("O sa te atac!");
        f.decreaseLife(power);
    }
}

