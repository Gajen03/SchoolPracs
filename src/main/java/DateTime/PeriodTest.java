/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import jdk.vm.ci.meta.Local;

/**
 *
 * @author Gajendran
 */
public class PeriodTest {
    public static void main(String[] args) {
        
        LocalDate birthday = LocalDate.of(2006,Month.JANUARY,03);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthday, today);
        
        System.out.println("I am "+age.getYears()+" years "+age.getMonths()+" months and "+age.getDays());
        
    }
}
