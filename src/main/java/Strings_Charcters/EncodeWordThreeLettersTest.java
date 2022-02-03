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
public class EncodeWordThreeLettersTest {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("");
        word.toUpperCase();
        String newWord ="";
        if(word.length()>3){
           String first3lett = word.substring(0,3);
           String last3lett = word.substring(3);
           newWord = ""+last3lett+first3lett;
           
           for(int i = 0;i>=newWord.length();i++){
               int lett = word.charAt(i);
                char lettChar = (char)((char)lett+1);
                
                System.out.print("new word: "+newWord);
           }
        }else{
            
        }
    }
}
