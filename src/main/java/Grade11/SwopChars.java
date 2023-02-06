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
public class SwopChars {
    public static void main(String[] args) {
        
        String word1 = JOptionPane.showInputDialog("Enter Word");
        String word2 = JOptionPane.showInputDialog("Enter Word");
        
        char firstletter1 = word1.charAt(0);
        char firstletter2 = word2.charAt(0);
        
        String newWord1 = word1.replace(firstletter1, firstletter2);
        String newWord2 = word2.replace(firstletter2, firstletter1);
        
        System.out.println(word1+" and "+word2);
        System.out.println(newWord1+" and "+newWord2);
    }
}
