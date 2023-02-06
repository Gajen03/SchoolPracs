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
public class ExtractInitials {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter Full Name");
        Scanner sc = new Scanner(name);
        while(sc.hasNext()){
            String name1 = sc.next();
            if(sc.hasNext()){
               String middlename = sc.next();
            }
            
        }
        
    }
}
