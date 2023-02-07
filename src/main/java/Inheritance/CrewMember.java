/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gajendran
 */
public class CrewMember {
    private String fullname;
    private int  crewID;
    private String department;
    public static int numPromotedCrew;

    public CrewMember(String inFN, int inCID, String inDT) {
        this.fullname = inFN;
        this.crewID = inCID;
        this.department = inDT;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getCrewID() {
        return crewID;
    }

    public void setCrewID(int crewID) {
        this.crewID = crewID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return this.fullname+"  CrewID: "+this.crewID+" ["+this.department+"]";
    }
    
    
    
    
}
