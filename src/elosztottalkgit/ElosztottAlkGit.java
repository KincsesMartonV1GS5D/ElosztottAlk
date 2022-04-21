/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elosztottalkgit;

import java.util.ArrayList;

/**
 *
 * @author Flin
 */
public class ElosztottAlkGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iskola iskola = new Iskola();
        
        
        
        Diak diak0 = new Diak("Jani","a1");
        diak0.addTargy(0, (float) 4);
        diak0.addTargy(1, (float) 2);
        Diak diak1 = new Diak("Sanyi","b2");
        diak1.addTargy(0, (float) 5);
        diak1.addTargy(1, (float) 5);
        Diak diak2 = new Diak("Margareta","b2");
        diak2.addTargy(0, (float) 4);
        diak2.addTargy(1, (float) 4);
        Diak diak3 = new Diak("Gergő","b2");
        diak3.addTargy(0, (float) 1);
        diak3.addTargy(1, (float) 1);
        Diak diak4 = new Diak("Máté","b2");
        diak4.addTargy(0, (float) 3);
        diak4.addTargy(1, (float) 1);

        
        iskola.addDiak(diak0);
        iskola.addDiak(diak1);
        iskola.addDiak(diak2);
        iskola.addDiak(diak3);
        iskola.addDiak(diak4);
        
        Tantargy matek = new Tantargy("Matek");
        Tantargy foldrajz = new Tantargy("Foldrajz");
        
        iskola.addTantargy(matek);
        iskola.addTantargy(foldrajz);
        
        Tanar tanar0 = new Tanar("Béla", new int[]{0,1});
        
        iskola.addTanar(tanar0);
//        System.out.println(diak0.getAtlag());
        
        ArrayList<Diak> top = iskola.getLegjobbak("b2");
        
        for (int i = 0; i < 3; i++) {
            System.out.println(i+" "+top.get(i).Nev+" "+top.get(i).getAtlag());
        }
    }
    
}
