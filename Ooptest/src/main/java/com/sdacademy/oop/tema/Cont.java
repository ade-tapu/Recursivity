package com.sdacademy.oop.tema;

import java.util.Date;

public class Cont {
    private int id;
    private int sold;
    private double anualInterestRate;
    private Date dateCreated;

    public Cont() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }


    public void setAnualInterestrate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public Date getDateCreated() {

        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {

        this.dateCreated = dateCreated;
    }

    public double getMonthhlyInterestRate() {
        double rate = sold * anualInterestRate/12;
        return rate;
    }

    public Cont(int id, int sold) {
        this.id = id;
        this.sold = sold;
    }
    public int Retragere(int sumaRetrasa){
        sold = sold - sumaRetrasa;
        return sold;

    }
    public int Depunere(int sumaDepusa){
        sold = sold+sumaDepusa;
        return sold;
    }
}
