/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners.PracticeScannerTest;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class UserDetails {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter name,surname and age seperated by one space");
        
        String name = "";
        String surname = "";
        String age = "";
        Scanner sc = new Scanner(input);
        while(sc.hasNext()){
             name = sc.next();
             surname = sc.next();
             age = sc.next();
            
        }
        System.out.println("Name: "+name+"\n"+"Surname "+surname+"\n"+"Age "+age);
    }
}
