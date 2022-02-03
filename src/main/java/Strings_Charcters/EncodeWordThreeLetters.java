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
public class EncodeWordThreeLetters {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("");
        word.toUpperCase();
        
       
        if(word.length()>3){
            String newWord = "";
            for(int i = 3; i<=word.length()-1;i++){
                int lett = word.charAt(i);
                char lettChar = (char)((char)lett+1);
               newWord += lettChar;
            }
            char char1 = newWord.charAt(0);
            char char2 = newWord.charAt(1);
            char char3 = newWord.charAt(2);
            
            String end = ""+char1+char2+char3;
            String output = newWord+""+end;
            System.out.println("Word: "+newWord);
            
        }else{
            
        }
    }
}
