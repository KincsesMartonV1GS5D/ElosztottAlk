/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elosztottalkgit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Flin
 */
public class ElosztottAlkGit {

    /**
     * @param args the command line arguments
     */
    private static String txtNeve = "A_legjobbak_log";
    
    public static void main(String[] args) {
        
        Iskola iskola = new Iskola();
        
        
        Diak diak = new Diak("Patrik","a1");
        diak.addTargy(0, (float) 5);
        diak.addTargy(1, (float) 2);
        Diak diak0 = new Diak("Jani","a1");
        diak0.addTargy(0, (float) 1);
        diak0.addTargy(1, (float) 2);
        Diak Eszter = new Diak("Eszter","a1");
        Eszter.addTargy(0, (float) 4);
        Eszter.addTargy(1, (float) 4);
        Diak Peti = new Diak("Peti","a1");
        Peti.addTargy(0, (float) 2);
        Peti.addTargy(1, (float) 3);
        Diak Jozsi = new Diak("Jozsi","a1");
        Jozsi.addTargy(0, (float) 3);
        Jozsi.addTargy(1, (float) 3);
        
        iskola.addDiak(diak);
        iskola.addDiak(diak0);
        iskola.addDiak(Eszter);
        iskola.addDiak(Peti);
        iskola.addDiak(Jozsi);
        
        
        Diak diak1 = new Diak("Sanyi","b2");
        diak1.addTargy(0, (float) 5);
        diak1.addTargy(1, (float) 5);
        Diak diak2 = new Diak("Margareta","b2");
        diak2.addTargy(0, (float) 4);
        diak2.addTargy(1, (float) 4);
        Diak diak3 = new Diak("Gergő","b2");
        diak3.addTargy(0, (float) 5);
        diak3.addTargy(1, (float) 1);
        Diak diak4 = new Diak("Máté","b2");
        diak4.addTargy(0, (float) 3);
        diak4.addTargy(1, (float) 1);

        
        
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
        //System.out.println(diak0.getAtlag());
        
        String top = iskola.getLegjobbak("a1");
        
        //siman kiirja a legjobbakat
        System.out.printf("%-9s%-10s%-6s%-10s%n","Helyezes","Nev","Atlag","Azonosíto");
        String split[] = top.split(",");
        for (int i = 0;  i <=8; i+=4) {
            System.out.printf("%-9s%-10s%-6s%-10s%n",split[i],split[i+1],split[i+2],split[i+3]);
        }
        
        //elvalaszto
        System.out.println("");
        //Letrehozza a txtNeve vel a filet
        LegjobbakMentes.createLegjobbak(txtNeve);
        //Beleirja a txtNeve vel es contentel a filet
        LegjobbakMentes.writeToFile(txtNeve, top);
        //Kiszedi a txtNeve file contentjet
        LegjobbakMentes.readFromFile(txtNeve);
    }

    
}
