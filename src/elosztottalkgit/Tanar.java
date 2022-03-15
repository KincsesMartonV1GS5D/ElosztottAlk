/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elosztottalkgit;

/**
 *
 * @author Flin
 */

/**
 * Tanar t = new Tanar("Tanar", new int[] { 0, 1, 2 });
 */
public class Tanar extends Ember {

    private int Azonosito;
    private int Tantargyak[];

    public Tanar(int tantargyak[]) {
        super();
    }

    public Tanar(String nev, int tantargyak[]) {
        super(nev);
        this.Tantargyak = tantargyak;
    }

    public int getAzonosito() {
        return this.Azonosito;
    }

    @Override
    public String toString(){
        return "";
    }

}
