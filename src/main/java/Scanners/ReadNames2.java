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
public class ReadNames2 {
    public static void main(String[] args) throws FileNotFoundException {
//        String FilePath = "data\\names.txt";
//
//        File f = new File(FilePath);
//        Scanner sc = new Scanner(f);
//        
//        String name = "";
//        String surname = "";
//        while(sc.hasNext()){
//            name = sc.next();
//            surname = sc.next();
//            
//            char nameInital = name.charAt(0);
//            System.out.println("New Name: "+nameInital+" "+surname);
//        }
//        
        String FilePath = "data\\IntNums.txt";

        File f = new File(FilePath);
        Scanner sc = new Scanner(f);
        int number = sc.nextInt();
        int sum = 0;
        int count = 0;
        int avg = 0;
        int highestNum = 0;
        int lowestNum = number;

        while (sc.hasNext()) {
            number = sc.nextInt();
            count++;
            sum += number;

            if (highestNum < number) {
                highestNum = number;
            }

            if (lowestNum > number) {
                lowestNum = number;
            }
            
        }

        avg = sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        System.out.println("Highest Number: " + highestNum);
        System.out.println("Lowest Number: " + lowestNum);

    }
}
