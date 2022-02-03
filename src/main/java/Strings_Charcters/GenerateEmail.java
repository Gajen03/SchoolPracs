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
        
        String nameStr = JOptionPane.showInputDialog("Enter Name: ");
        String name = nameStr.toLowerCase();
        String nameE = "";
        String surnameE = "";
        for(int i = 0;i<name.indexOf(" ");i++){
            char nameChar = name.charAt(i);
            nameE += nameChar;
        }
        for(int i = 0;i>name.lastIndexOf(" ");i++){
            char surnameChar = name.charAt(i);
            surnameE += surnameChar;
        }    
        System.out.println(nameE+"."+surnameE+"@reddam.house");    


    }
}
