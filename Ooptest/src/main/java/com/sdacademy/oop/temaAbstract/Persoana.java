package com.sdacademy.oop.temaAbstract;

public class Persoana implements Comparable<Persoana> {
    private int varsta;

    public Persoana(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public int compareTo(Persoana persoana) {
        if (persoana.getVarsta() > this.getVarsta()) {
            return -1;
        } else if (persoana.getVarsta() < this.getVarsta()) {
            return 1;
        } else if (persoana.getVarsta() == this.getVarsta()) {
            return 0;
        }
        return 0;    }
}
