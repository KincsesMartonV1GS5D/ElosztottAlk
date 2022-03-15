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
    private Map<Integer,Float> Tantargyak;
    private int Osztaly;

    public Diak(int osztaly) {
        this.Osztaly = osztaly;
        this.Tantargyak = new HashMap<Integer, Float>();
    }
    public void addTargy(int TargyID, float DiakAtlag){
        Tantargyak.put(TargyID,DiakAtlag);
    }
    
    public Diak(String nev, int osztaly) {
        super(nev);
        this.Osztaly = osztaly;
        this.Tantargyak = new HashMap<Integer, Float>();
    }

    public int getAtlag() {
        return 0;
    }

    @Override
    public String toString(){
        return "";
    }
    
}
