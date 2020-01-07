package com.sdacademy.oop.temaAbstract;

public class Patrat implements Comparable<Patrat> {
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    @Override
    public int compareTo(Patrat patrat) {
        if (patrat.getArea() > this.getArea()) {
            return -1;
        } else if (patrat.getArea() < this.getArea()) {
            return 1;
        } else if (patrat.getArea() == this.getArea()) {
            return 0;
        }
        return 0;
    }


    public double getArea(){
        return latura * latura;
    }
}
