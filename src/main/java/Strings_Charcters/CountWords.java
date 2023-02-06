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
public class CountWords {
    public static void main(String[] args) {
    //intaialise vars
        int count = 0;
        String word = JOptionPane.showInputDialog("Enter Word");
        //check vars
        while(!word.equalsIgnoreCase("stop")){
            //process/print vars
            word = JOptionPane.showInputDialog("Enter Word");
            // change vars
            count ++;
        }
        System.out.println("the total amount of words is "+count);
    }
}
