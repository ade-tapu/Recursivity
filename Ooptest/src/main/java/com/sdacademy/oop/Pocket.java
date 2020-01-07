package com.sdacademy.oop;

public class Pocket {
    private int money;

    public Pocket(int money) {
        this.money = money;
    }

    public int getMoney() {
        if (money <= 10) {
            System.out.println("0");
        }
        return money;

    }


    public void setMoney(int money) {
        if (money<0 || money>300) {
            System.out.println("i dont have enough space");
            this.money = money;
        }

    }
}
