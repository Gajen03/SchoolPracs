/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Rev;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class LearnerManager {

    private static Learner learnerArr[] = new Learner[50];
    int learnerCount = 0;

    public LearnerManager() throws FileNotFoundException {
        File f = new File("data\\excursion.txt");

        Scanner fileSc = new Scanner(f);

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        while (fileSc.hasNext()) {
            Scanner sc = new Scanner(fileSc.nextLine()).useDelimiter("#");
            String name = sc.next();

            String activity1 = sc.next();
            double activity1Cost = sc.nextDouble();
            LocalDateTime activity1Date = LocalDateTime.parse(sc.next(), inputFormatter);

            String activity2 = sc.next();
            double activity2Cost = sc.nextDouble();
            LocalDateTime activity2Date = LocalDateTime.parse(sc.next(), inputFormatter);

        }
    }

    public void overrideLearnerCode() {
        for (int i = 0; i < learnerArr.length; i++) {
            Learner learner = learnerArr[i];
            String learnerCode = learner.getLearnerCode() + "" + i;
            i++;

        }
    }

    public void sort() {

        for (int sorted = learnerArr.length - 1; sorted > 0; sorted--) {
            for (int currentIndex = 0; currentIndex < sorted; currentIndex++) {
                Learner learner1 = learnerArr[currentIndex];
                Learner learner2 = learnerArr[currentIndex + 1];

                if (learner1.calcStudentTotalCost() > learner2.calcStudentTotalCost()) {
                    Learner temp = learnerArr[currentIndex];
                    learnerArr[currentIndex] = learnerArr[currentIndex + 1];
                    learnerArr[currentIndex + 1] = temp;
                }
            }

        }
    }

    public double getAverageCost() {
       
        double totalCost = 0;
        
        for (int i = 0; i < learnerArr.length; i++) {
            totalCost += learnerArr[i].calcStudentTotalCost();
            i++;
        }
        
        double avg = totalCost / learnerCount;
        return avg;
    }

    public double getLowestCost() {

        double lowest = 0;

        for (int i = 0; i < learnerArr.length; i++) {
            double learner1Cost = learnerArr[i].calcStudentTotalCost();
            double learner2Cost = learnerArr[i + 1].calcStudentTotalCost();
            if (learner1Cost < learner2Cost) {
                lowest = learner1Cost;
            }
            i++;
        }
        return lowest;
    }

    public double getHighestCost() {
        double highest = 0;

        for (int i = 0; i < learnerArr.length; i++) {
            double learner1Cost = learnerArr[i].calcStudentTotalCost();
            double learner2Cost = learnerArr[i + 1].calcStudentTotalCost();
            if (learner1Cost > learner2Cost) {
                highest = learner1Cost;
            }
            i++;
        }
        return highest;
    }
    
    public String displaySummary(){
        return "FINANCIAL STATISTICS\n"
                + "-------------------------------------"
                + "NUM LEARNERS: "+learnerCount
                + "AVERAGE COST: "+getAverageCost()
                + "LOWEST COST: "+getLowestCost()
                + "HIGHEST COST: "+getHighestCost();
    }

}
