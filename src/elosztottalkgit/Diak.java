/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elosztottalkgit;

import java.util.ArrayList;

/**
 *
 * @author Flin
 */
public class Diak extends Ember {

    private int Azonosito;
    private ArrayList<Tantargy> Tantargyak;
    private int Osztaly;

    public Diak(int osztaly) {
        super();
        this.Osztaly = osztaly;
        this.Tantargyak = new ArrayList<Tantargy>();
    }

    public Diak(String nev, int osztaly) {
        super(nev);
        this.Osztaly = osztaly;
        this.Tantargyak = new ArrayList<Tantargy>();
    }

    public int getAtlag() {
        return 0;
    }

    @Override
    public String toString(){
        return "";
    }
    
}
