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

        best.add(Diakok.get(0));
        best.add(Diakok.get(1));
        best.add(Diakok.get(2));
        
        
        for (int i = 3; i < Diakok.size(); i++) {
                
            if (Diakok.get(i).getOsztaly() == s) {
                
                System.out.println(Diakok.get(i).Nev+" "+Diakok.get(i).getOsztaly());
                System.out.println(best.get(0).Nev+" "+best.get(0).getOsztaly()+"           a");
                if (best.get(0).getAtlag()<Diakok.get(i).getAtlag()) {
                    best.set(0, Diakok.get(i));
                }
                if(best.get(1).getAtlag()<Diakok.get(i).getAtlag()){
                    best.set(1, Diakok.get(i));
                }
                if(best.get(2).getAtlag()<Diakok.get(i).getAtlag()){
                    best.set(2, Diakok.get(i));
                }
            }
            
        }
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