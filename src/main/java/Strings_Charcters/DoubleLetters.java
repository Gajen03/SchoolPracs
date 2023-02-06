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
public class DoubleLetters {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter word with to of the same letter:");
        
        char prev = ' ';
        String output = "";
        
        for(int i = 0;i< word.length();i++){
            char curr = word.charAt(i);
            if(curr != prev){
                output += curr;
            }
            
            prev = curr;
        }
        System.out.println("Word: "+output);
    }
}
