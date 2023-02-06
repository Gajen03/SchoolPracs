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
public class GenerateEmail {
    public static void main(String[] args) {
        
        String fullname = JOptionPane.showInputDialog("Enter Name: ").toLowerCase();
        
        
        String name = fullname.substring(0, fullname.indexOf(" "));
        String surname = fullname.substring(fullname.lastIndexOf(" ")+1,fullname.length());
        String email = name+"."+surname+"@reddam.house";
           
        System.out.println(email);    
        

    }
}
