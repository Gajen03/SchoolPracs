/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grade11;

import javax.swing.JOptionPane;

/**
 *
 * @author SWG_T28
 */
public class EncodeWordThreeLetters {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter Word");
        
        if (word.length() - 1 > 3) {
            for (int i = 0; i <= word.length() - 1; i++) {
                int wordChar = word.charAt(i) + 1;
                char wordChars = (char) wordChar;
                System.out.print(wordChars);
            }
        } else {
            for (int j = word.length()-1; j <=0; j--) {
                char wordChars = word.charAt(word.length()-1);
                int wordChar = word.charAt(j) + 1;
                wordChars = (char) wordChar;
                System.out.println(wordChars);
            }

        }
    }
 }

