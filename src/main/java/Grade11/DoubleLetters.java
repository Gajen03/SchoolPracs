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
public class DoubleLetters {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter Word");
        System.out.println("Word: "+ word);
        
        char charTest = ' ';
        String newWord = "";
        for(int i =0;i>=word.length();i++){
            
            char charI = word.charAt(i);
            
            if(charI != charTest){
                charTest = charI;
            }else{
                newWord = word.replace(charI,' ');
                
            }
        }
        System.out.println("Word 2: "+ newWord);
        
    }
            
}
