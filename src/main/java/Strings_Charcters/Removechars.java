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
public class Removechars {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter and word");
        String unwantedInput = JOptionPane.showInputDialog("Enter Unwated characters");
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            String inputChar = "" + input.charAt(i);
            if (!inputChar.contains(unwantedInput)) {
                output += inputChar;
                          }
        }
        System.out.println("Word: " + output);
    }
}
