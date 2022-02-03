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
public class FlipCase {
    public static void main(String[] args) {
         String word = JOptionPane.showInputDialog("Enter word");
         
         String output = "";
         for(int i = 0;i<word.length();i++){
             char wordChar = word.charAt(i);
             String wordCharStr = ""+word.charAt(i);
             
             if(Character.isUpperCase(wordChar)){
                 String wordLower = wordCharStr.toLowerCase();
                 output+=wordLower;
             }else{
                 String wordUpper = wordCharStr.toUpperCase();
                 output+=wordUpper;
             }
         }
         System.out.println("Word: "+output);
    }
}
