/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners.PracticeScannerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gajendran
 */
public class Test {
    public static void main(String[] args) {
            File f = new File("data//test.txt");
        
            String name = "";
            String surname = "";
            String age = "";
        try {
            Scanner sc = new Scanner(f);
            
            while(sc.hasNext()){
                name = sc.next();
                surname = sc.next();
                age = sc.next();
            }
            System.out.println("Name: "+name+"\nSurname: "+surname+"\nAge: "+age);
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
