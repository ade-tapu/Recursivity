package com.sdacademy.oop.tema;

public class Dreptunghi {
    private double lungime=1;
    private double latime=1;

    public Dreptunghi() {
    }

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
    //aria lungime*latime
    //perimetru 2*(lungime+latime)

    public double Aria(){
        double aria = lungime * latime;
        return aria;
    }
    public double Perimetru(){
        double perimetru = 2*(lungime+latime);
        return perimetru;
    }

}
