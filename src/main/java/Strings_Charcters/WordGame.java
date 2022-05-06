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
public class WordGame {
    public static void main(String[] args) {
        //intaialise vars
        String word = JOptionPane.showInputDialog("Enter Word");
        String word2 = JOptionPane.showInputDialog("Enter Word");
        
        int points = 0;

        //check vars
        while (word.charAt(word.length()-1) == word2.charAt(0)){
               //process/print vars
                points++;
                word = word2;
                // change vars
                word2 = JOptionPane.showInputDialog("Enter Word");
            }
            System.out.println("You got "+points+" points");
    }
}
