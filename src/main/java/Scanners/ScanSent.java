/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class ScanSent {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Sentence: ");
        
        Scanner sc = new Scanner(input);
        int words = 0;
        
        while(sc.hasNext()){
            words++;
        }
        System.out.println("number of word in the sentecne is: "+words);
    }
}
