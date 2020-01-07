package com.sdacademy.oop;

public class User {
    private String nume = "Fara nume";
    private String prenume;
    private int varsta;

    public User() {
    }

    public User(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public User(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}

