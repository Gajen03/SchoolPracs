/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Gajendran
 */
public class Officer extends CrewMember{
    
    private int rank;
    private LocalDate  datePromoted;
    public static int numPromotedOfficers = 0;
    
    public Officer(String inFN, int inCID, String inDT, int inRK, LocalDate inDP) {
        super(inFN, inCID, inDT);
        
        this.rank = inRK;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date1 = inDP.format(dtf);
        this.datePromoted = LocalDate.parse(date1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public String getTitle(){
        if(this.rank == 1){
            return "Ensign";
        }else if(this.rank == 2){
            return "Lieutenant";
        }else if(this.rank == 3){
            return "Lt Commander";
        }else if(this.rank == 4){
            return "Commander";
        }else if(this.rank == 5){
            return "Captain";
        }else{
            return null;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+getTitle();
    }
    
    public void promote(){
        if(this.rank <= 4){
            this.rank ++;
            numPromotedOfficers++;
            this.datePromoted = LocalDate.now();
            
        }
    }
    
}
