/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class NumberScanner {
    public static void main(String[] args) throws FileNotFoundException {
        
        String FilePath = "data\\avgAge.txt";

        File f = new File(FilePath);
        Scanner sc = new Scanner(f);
        double numAge = 0;
        int sumAge = 0;
        
        while (sc.hasNext()) {
            String numberStr = sc.next();
            int number = Integer.parseInt(numberStr);
            sumAge += number;
            numAge++;
        }
        
        double avgAge = sumAge / numAge;
        System.out.println("Avg of age: " + avgAge);
    }
}
