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
    
    public Ember() {
        EmberSzamlalo++;
        this.Nev = "Ember" + EmberSzamlalo;
    }

    public Ember(String nev) {
        EmberSzamlalo++;
        this.Nev = nev + EmberSzamlalo;
    }
    
    public String getNev() {
        return Nev;
    } 
    
    @Override
    public String toString(){
        return String.format("{\n\tNév: %s\n}", this.Nev);
    }

}