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
  * [[ Ember osztály ]]
  * EmberSzamlalo -> számon tartja a létrehozott példányokat az osztályból
  * Nev -> szöveges változó, tárolja az aktuális példány 'nevét'
  * Ember() -> üres konstruktor arra az esetre ha nem lenne név megadva
  * Ember(nev) -> név megadása esetén hozzárendeli a 'Nev' nevű változóhoz
  * getNev() -> visszaadja a 'Nev' változó aktuális értékét
  * toString() -> osztályleírást generál és kiíratható formában visszaadja
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
        //this.Nev = nev + EmberSzamlalo;
        this.Nev = nev;
    }
    
    public String getNev() {
        return Nev;
    } 
    
    @Override
    public String toString(){
        return String.format("{\n\tNév: %s\n}", this.Nev);
    }

}