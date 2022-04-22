/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elosztottalkgit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Flin
 */
public class Diak extends Ember {

    private int Azonosito;
    private String Osztaly;
    
    
    private Map<Integer,Float> Tantargyak;
    

    public Diak(String osztaly) {
        super();
        this.Osztaly = osztaly;
        this.Tantargyak = new HashMap<Integer, Float>();
    }
    public void addTargy(int TargyID, float DiakAtlag){
        Tantargyak.put(TargyID,DiakAtlag);
    }
    
        public Diak(String nev, String osztaly) {
        super(nev);
        this.Azonosito = this.EmberSzamlalo;
        this.Osztaly = osztaly;
        this.Tantargyak = new HashMap<Integer, Float>();
    }

    public float getAtlag() {
        float szum = 0;
        for (Map.Entry<Integer,Float> entry : this.Tantargyak.entrySet())
            szum += entry.getValue();
        
        return szum/this.Tantargyak.size();
    }
    public int getAzonosito() {
        return Azonosito;
    }

    public String getOsztaly() {
        return Osztaly;
    }
    @Override
    public String toString(){
        return "";
    }
    
}
