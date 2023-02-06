/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Charcters;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import javax.swing.JOptionPane;
import jdk.internal.icu.text.UTF16;

/**
 *
 * @author Gajendran
 */
public class CharcterBasics {

    //intaialise vars
    //check vars
    //process/print vars
    // change vars
    
    public static void main(String[] args) {
       
        int numLetters = 0;
        int numNumbers = 0;
        int numOthers= 0;
        
        String charsStr = JOptionPane.showInputDialog("Enter Char");
//        charsStr.toUpperCase();
        char chars = charsStr.charAt(0);
        
        while (chars != 'x' && chars != 'X'){
             
            if(isDigit(chars)){
                numLetters ++;
            }else if(isLetter(chars)){
                numNumbers ++;
            }else{
                numOthers ++;
            }
             charsStr = JOptionPane.showInputDialog("Enter Char");
             chars = charsStr.charAt(0);
             
            
        }
            System.out.println("Number of Letters: "+numLetters);
            System.out.println("Number of Numbers: "+numNumbers);
            System.out.println("Number of Others: "+numOthers);
    }

}

