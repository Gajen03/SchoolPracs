/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package November2022Rev;

import DateTime.DateTime;
import java.time.LocalDateTime;

/**
 *
 * @author Gajendran
 */
public class Activity {
    
    private String description  ;
    private double cost  ;
    private LocalDateTime actDate;
    
    public final double INSURANCE_COST = 105.25;

    public Activity(String description, double cost, LocalDateTime actDate) {
        this.description = description;
        this.cost = cost;
        this.actDate = actDate;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public LocalDateTime getActivityDate() {
        return actDate;
    }
    
    
    
    
    
    
}
