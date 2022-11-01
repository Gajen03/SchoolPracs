/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gajendran
 */
public class StringToDate {
    public static void main(String[] args) {
        
        String dateStr = "17-06-2004";
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        System.out.println(date);
    }
}
