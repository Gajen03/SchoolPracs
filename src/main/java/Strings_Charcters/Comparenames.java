/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Charcters;

import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class Comparenames {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter Name");
       System.out.println("Name "+name);
        String alpha = name;
        
        for(int i = 0; i<4;i++){
            
            name = JOptionPane.showInputDialog("Enter Name");
            System.out.println("Name "+name);
            int check = name.compareTo(alpha);
            if(check < 0){
                alpha = name;
            }
            
        }
            System.out.println("The first name alphabetically is: "+alpha);
        
        
    }
}
