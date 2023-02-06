/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class PlayerManager {

    // file path
    private static final String playerFilePath = "data\\team.txt";

    public static void readPlayers() throws FileNotFoundException {
        
        File f = new File(playerFilePath);
        Scanner fileSc = new Scanner(f);

        while (fileSc.hasNext()) {
            // only scans the line
            String line = fileSc.next();
            Scanner lineSc = new Scanner(line).useDelimiter("#");

            String name = lineSc.next();
            String surname = lineSc.next();
            String postion = lineSc.next();
            int number = lineSc.nextInt();
            //print all players
            System.out.println("Name: " + name + " " + surname + "\t\t\tPostion: " + postion + "\t\t\tNumber: " + number);
        }

        // always close scanner
        fileSc.close();
    }

    public static void addPlayer(String name, String surname, String position, int number) {
        
        try {
            FileWriter fw = new FileWriter(playerFilePath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(name+"#"+surname+"#"+position+"#"+number+"\n");
            // always close pw
            pw.close();
        } catch (IOException ex) {
            System.out.println("File not found");

        }
        
    }
}
