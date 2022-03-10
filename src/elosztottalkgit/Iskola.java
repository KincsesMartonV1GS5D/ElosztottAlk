package elosztottalkgit;

import java.util.ArrayList;

public class Iskola {
    
    private ArrayList<Tantargy> Tantargyak;
    private ArrayList<Tanar> Tanarok;
    private ArrayList<Diak> Diakok;

    public Iskola() {
        this.Tantargyak = new ArrayList<Tantargyak>();
        this.Tanarok = new ArrayList<Tanarok>();
        this.Diakok = new ArrayList<Diakok>();
    }

    public void addTantargy(Tantargy t) {
        this.Tantargyak.add(t);
    }

    public void addTanar(Tanar t) {
        this.Tanarok.add(t);
    }

    public void addDiak(Diak d) {
        this.Diakok.add(d);
    }

    @NotImplemented
    public ArrayList<Diak> getLegjobbak(int top) {
        return new ArrayList<Diak>();
    }

    @NotImplemented
    public boolean kiir() {
        return false;
    }

    @NotImplemented
    public void beolvas(String fajlnev) {

    }

    @NotImplemented
    @Override
    public String toString() {
        return "";
    }

}