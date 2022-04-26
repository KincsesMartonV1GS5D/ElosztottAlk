/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package elosztottalkgit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Flin
 */

public class LegjobbakMentes {
    public static boolean createLegjobbak(String nev) {
        try {
            File myObj = new File(nev+".txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
            return true;
        } catch (IOException e) {
            System.out.println("Mas nevvel pls!");
            e.printStackTrace();
            return false;
        }
    }
    public static void writeToFile(String nev, String content) {
        try {
            FileWriter myWriter = new FileWriter(nev+".txt");
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
     public static void readFromFile(String nev) {
        try {
            File myObj = new File(nev+".txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String split[] = data.split(",");
            for (int i = 0; i <=8; i +=4) {
                System.out.printf("%-9s%-10s%-6s%-10s%n",split[i],split[i+1],split[i+2],split[i+3]);
            }
        }
        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

