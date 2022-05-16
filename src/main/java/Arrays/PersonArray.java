/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class PersonArray {

    private Person[] pArr = new Person[50];
    private int size = 0;

    public PersonArray() throws FileNotFoundException {
        String filepath = "data//personObject";
        File f = new File(filepath);

        Scanner fileScanner = new Scanner(f);

        while (fileScanner.hasNext()) {

            String line = fileScanner.nextLine();

            Scanner lineSc = new Scanner(line).useDelimiter("#");
            String name = lineSc.next();
            String surname = lineSc.next();
            int age = lineSc.nextInt();

            size++;
        }
    }
}
