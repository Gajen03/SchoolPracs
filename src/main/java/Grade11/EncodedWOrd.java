/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grade11;

import java.util.stream.IntStream;
import javax.swing.JOptionPane;

/**
 *
 * @author SWG_T28
 */
public class EncodedWOrd {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter Word");
        System.out.println("Word: "+word);
        
        System.out.print("Word:");
        for(int i = 0 ; i <= word.length()-1;i++){
             int wordChar = word.charAt(i)+1;
             char wordChars = (char) wordChar;
             System.out.print(wordChars);
                     
             
        }
    }
 
}
