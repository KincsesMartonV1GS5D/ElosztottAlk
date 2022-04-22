package elosztottalkgit;

import java.util.ArrayList;
import java.util.Collections;
 

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

    
    public ArrayList<Diak> getLegjobbak(String s) {
        ArrayList<Diak> best = new ArrayList<Diak>();
        for (int i = 0; i < Diakok.size(); i++) {
            if (Diakok.get(i).getOsztaly().equals(s)) {
                best.add(Diakok.get(i));
            }
        }
            for (int i = 0; i < best.size(); i++) {
                for (int k = 1; k < best.size()-i; k++) {
                    if (best.get(k-1).getAtlag()<best.get(k).getAtlag()) {
                        Collections.swap(best,k,k-1);
                    }
                }
            }
        /*for (int i = 0; i < best.size(); i++) {
            System.out.println("  "+best.get(i).Nev+" "+best.get(i).getOsztaly()+" "+ best.get(i).getAtlag()+" "+best.get(i).getAzonosito());
        }*/
        return best;
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