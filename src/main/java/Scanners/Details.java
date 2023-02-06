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
public class Details {
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter:\n Name\nID number\nheight(m)\nif you smoke true or false");
    
        Scanner sc = new Scanner(input);
        
        String name = sc.next();
        int id = sc.nextInt();
        double height = sc.nextDouble();
        boolean smoke = sc.nextBoolean();
        System.out.println("Name: " + name + "\nID: " + id + "\nHeight(m): " + height + "\nDo you smoke?: " + smoke);
        
    }
}
