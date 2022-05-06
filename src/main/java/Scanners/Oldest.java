/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class Oldest {
    public static void main(String[] args) {
         String input = JOptionPane.showInputDialog("Enter:\n Name\nAge");
    
        
        String oldestName = "";
        int oldestAge = 0;
        
        while(!input.equalsIgnoreCase("Stop")){
            Scanner sc = new Scanner(input);
            String name = sc.next();
            int age = sc.nextInt();
            
            if(age>oldestAge){
                oldestAge = age;
                oldestName = name;
            }
            input = JOptionPane.showInputDialog("Enter:\n Name\nAge");
            
        }
        System.out.println("Oldest persaon is:"+oldestName);
    }
}
