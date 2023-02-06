/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Gajendran
 */
public class DateAndTimeFormatter {
    public static void main(String[] args) {
        
        LocalDateTime today =  LocalDateTime.now();
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = today.format(dtf1);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MM-yy");
        String date2 = today.format(dtf2);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String date3 = today.format(dtf3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd MMM yy");
        String date4 = today.format(dtf4);
          
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
    }
}
