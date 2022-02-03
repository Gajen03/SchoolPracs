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
public class EncodeWord {
    public static void main(String[] args) {
        
           String word = JOptionPane.showInputDialog("Enter word with to of the same letter:");
           
           System.out.println("Word");
           for(int i = 0;i<word.length();i++){
               int lett = word.charAt(i);
               
               char lettChar = (char)((char)lett+1);
               System.out.print(lettChar);
           }
    }
}
