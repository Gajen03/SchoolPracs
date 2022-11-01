/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Rev;

import DateTime.DateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gajendran
 */
public class Learner {
    
    private static String learnerName ;
    private static String learnerCode ;
    private static Activity activityOne  ;
    private static Activity activityTwo  ;
    
    private static int numLearners =0;
    
    public static int getNumLearners(){
        return numLearners;
    }

    public Learner(String learnerName, Activity activityOne, Activity activityTwo) {
        this.learnerName = learnerName;
        this.activityOne = activityOne;
        this.activityTwo = activityTwo;
        
        String first3let = learnerName.substring(0, 3);
        double randomNum = Math.random()*90+10;
        
        learnerCode = first3let.toUpperCase()+""+randomNum;
        
        numLearners++;
    }
    
    public double calcStudentTotalCost(){
        return activityOne.getCost() + activityTwo.getCost();
    }

    public String getLearnerCode() {
        return learnerCode;
    }

    public void setLearnerCode(String learnerCode) {
        this.learnerCode = learnerCode;
    }

    
    ////// you need to do this last question done was 3.4

    public String toString() {
        
        DateTimeFormatter outputFormatted = DateTimeFormatter.ofPattern("EE MM dd");
        
        return "Name: "+learnerName+"("+learnerCode+")\n"
                + "Activity1: "+activityOne.getActivityDate().format(outputFormatted)+" - "+activityOne.getDescription()+"\n"
                + "Activity2: "+activityTwo.getActivityDate().format(outputFormatted)+" - "+activityTwo.getDescription()+"\n"
                + "Cost: "+calcStudentTotalCost();
    }
    
    
    
    
    
    
}
