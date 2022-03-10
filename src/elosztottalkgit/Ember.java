/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elosztottalkgit;

/**
 *
 * @author Flin
 */
abstract class Ember {
    static int EmberSzamlalo = 0;
    protected String Nev;
    

    
    public Ember(String nev) {
        EmberSzamlalo += 1;
        this.Nev = nev + EmberSzamlalo;
    }
    
    public String getNev() {
        return Nev;
    } 
    public String toString(){
        return "";
    }
}
