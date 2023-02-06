/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import Arrays.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class StudentManager {
    private Student[] sArr = new Student[50];
    private int size = 0;
    
    public StudentManager() throws FileNotFoundException {
        File f = new File("data\\student.txt");
        
        Scanner sc = new Scanner(f);
        
        
        while(sc.hasNext()){
            
          Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
          String name = lineSc.next();
          String surname = lineSc.next();
          String birthdayStr = lineSc.next();
          
          //
          DateTimeFormatter dtfInput = DateTimeFormatter.ofPattern("dd-MM-yyyy");
           LocalDate birthday = LocalDate.parse(birthdayStr,dtfInput);
           sArr[size] = new Student(name,surname,birthday);
           size++;
          //
        }
        
        
    }
    
    
    public String toString(){
        String output = "";
        for (int i = 0; i <size; i++) {
            output += sArr[i]+"\n" ;
        }
        return output;
        
    }
       

       
    
    
    
}
