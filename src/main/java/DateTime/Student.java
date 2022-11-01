/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gajendran
 */
public class Student {

        private String name;
        private String surname;
        private LocalDate birthday ;

    public Student(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        
        //Specific Format
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yy");
        String birthdayStr = birthday.format(dtf);
        return ""+name+" "+surname+" "+ birthdayStr;
    }

        
            
       
        


      
}
