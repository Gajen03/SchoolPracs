/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.time.LocalDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class CrewMemberManager {

    private CrewMember[] cArr = new CrewMember[80];
    private int size = 0;

    public CrewMemberManager() throws FileNotFoundException {
        File f = new File("data\\crewmembers.txt");

        Scanner sc = new Scanner(f);

        while (sc.hasNext()) {
            Scanner lineSc = new Scanner(sc.nextLine()).useDelimiter("#");
            String fullname = lineSc.next();
            int crewID = lineSc.nextInt();
            String department = lineSc.next();

            cArr[size] = new CrewMember(fullname, crewID, department);
            size++;
        }

    }
    
    public int findCrewMeber(int crewID){
        int max = size-1;
        int min = 0;
        int mid = (max + min) / 2;

        while (min <= max) {
            if (crewID < mid) {
                min = mid + 1;
            }
            else if(crewID >mid){
                max = mid-1;
            }else{
                return mid;
            } 
        }
        return -1;
    }
    
    // you were on 6.2 
    
     


    public String toString() {

        String output = "";
        for (int i = 0; i < size; i++) {
            output += cArr[i];
            output += "\n";
        }
        return output;
    }


      
      
}
