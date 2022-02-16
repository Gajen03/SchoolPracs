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
public class FieScanner {

    public static void main(String[] args) throws FileNotFoundException {

        String FilePath = "data\\names.txt";

        File f = new File(FilePath);
        Scanner sc = new Scanner(f);
        String alphaName = sc.next();

        while (sc.hasNext()) {
            String name = sc.next();
            if (name.compareTo(alphaName) < 0) {
                alphaName = name;
            }
        }
        System.out.println("Most Alpha Name: " + alphaName);
    }
}
