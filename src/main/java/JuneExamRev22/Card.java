/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuneExamRev22;

import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class Card {
    
    private String name ;
    private String type ;
    private int basic ;
    private int special ;
    private int leader ;
    private int unique ;
    
    private static final int LIGHTFACTOR = 3 ;
    private static final double DARKFACTOR = 2.5;

    public Card(String name, String type, int basic, int special, int leader, int unique) {
        this.name = name;
        this.type = type;
        this.basic = basic;
        this.special = special;
        this.leader = leader;
        this.unique = unique;
    }

    public String getName() {
        return name;
    }
    
    public boolean checkLight(){
        
        Scanner typeSc = new Scanner(type);
        typeSc.useDelimiter(",");

        while (typeSc.hasNext()) {
            String lightCheck = typeSc.next();

            if (lightCheck.equalsIgnoreCase("Light")) {
                return true;
            } 
        }
        return false;
    }
    
    public double calcPoints(){
        boolean light = checkLight();
        
        if(light == true){
          
          return (basic+special+leader+unique)*LIGHTFACTOR;
        }else{
          return (basic+special+leader+unique)*DARKFACTOR;
        }
    }
    
    public String getNameTypePoints(){
        return name+" "+calcPoints();
    }

    @Override
    public String toString() {
        boolean light = checkLight();
        
        if (light == true) {
            return name + "\t" + type + "\t" + basic + " " + special + " " + leader + " " + unique + "\t"+LIGHTFACTOR;
        } else {
            return name + "\t" + type + "\t" + basic + " " + special + " " + leader + " " + unique+"\t"+DARKFACTOR;
        }
    }
    
    

    
}
