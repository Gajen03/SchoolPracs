/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SWG_T28
 */
public class Test {
    public static void main(String[] args) {
        String filepath = "test.txt";
        File f = new File(filepath);
        
        try {
            Scanner sc = new Scanner(f);
            String name = "";
            String surname = "";
            String age = "";
            while(sc.hasNext()){
                name = sc.next();
                surname = sc.next();
                age = sc.next();
                
                System.out.println("Name: "+name+"\nSurname: "+surname+"\nAge: "+age);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
