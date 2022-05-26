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
public class ResultsSet {
    private String name ;
    private String email ;
    private int scoreAlg ;
    private int scoreGeo;
    private int scoreTrig ;

    public ResultsSet(String name, String email, int scoreAlg, int scoreGeo, int scoreTrig) {
        this.name = name;
        this.email = email;
        this.scoreAlg = scoreAlg;
        this.scoreGeo = scoreGeo;
        this.scoreTrig = scoreTrig;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getRating(){
        
        double ratingD  = (scoreTrig*0.35)+(scoreAlg*0.45)+(scoreGeo*0.2);
        int rating = (int) ratingD;
        
        return rating;
    }
    
    public String reformatName(){
        Scanner sc = new Scanner(name);
        
        String initials = "";
        String surname = "";
        while(sc.hasNext()){
            String currentName = sc.next();
            
            if(sc.hasNext()){
                //initial
               initials += currentName.charAt(0);
            }else{
                //surname
                surname = currentName.toUpperCase();
                       
            }
           
        }
        
        return surname+", "+initials;
    }
    
    public String nameAndRating(){
        
        return reformatName()+" "+getRating();
    }
    @Override
    public String toString() {
        return name+"#"+email+"#"+scoreAlg+"#"+scoreGeo+"#"+scoreTrig;
    }
    
    

    
 
   

    

   

    

    
    
}
