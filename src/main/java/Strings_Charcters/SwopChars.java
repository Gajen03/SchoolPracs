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
public class SwopChars {
    public static void main(String[] args) {
        
           String word1 = JOptionPane.showInputDialog("Enter Word:");
           String word2 = JOptionPane.showInputDialog("Enter Word:");
           
           char firstLett1 = word1.charAt(0);
           char firstLett2 = word2.charAt(0);
           
           String newWord1 = word1.replace(firstLett1, firstLett2);
           String newWord2 = word2.replace(firstLett2, firstLett1);
           
           System.out.println(word1+" and "+word2);
           System.out.println(newWord1+" and "+newWord2);
    }
}
