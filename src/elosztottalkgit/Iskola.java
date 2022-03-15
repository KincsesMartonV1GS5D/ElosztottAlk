package elosztottalkgit;

import java.util.ArrayList;
 

public class Iskola {
    
    private ArrayList<Tantargy> Tantargyak;
    private ArrayList<Tanar> Tanarok;
    private ArrayList<Diak> Diakok;

    public Iskola() {
        this.Tantargyak = new ArrayList<Tantargy>();
        this.Tanarok = new ArrayList<Tanar>();
        this.Diakok = new ArrayList<Diak>();
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

    
    public ArrayList<Diak> getLegjobbak(int top) {
        return new ArrayList<Diak>();
    }

    
    public boolean kiir() {
        return false;
    }

    
    public void beolvas(String fajlnev) {

    }

    
    @Override
    public String toString() {
        return "";
    }

}