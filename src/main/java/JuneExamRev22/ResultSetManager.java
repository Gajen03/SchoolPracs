package JuneExamRev22;

import java.io.FileWriter;
import java.io.PrintWriter;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gajendran
 */
public class ResultSetManager {
    private String filepath = "data//results";

    public ResultSetManager(String f) {
    }

    public void saveResult(String n ,String e,int sA,int sG,int sT){
        ResultsSet rs = new ResultsSet(n, e, sG, sG, sT);
        
        try {
           
            FileWriter fw = new FileWriter(filepath,true);
            PrintWriter pw = new PrintWriter(fw);
            pw.append(rs.toString());
            pw.close();
            
        } catch (Exception x) {
            
            System.out.println("Error");
        }
        
    }
    
    public void printRating(){
        System.out.println("MATH APP - ALL RESULTS\n--------------------------------------");
        
        
    }

 
}
