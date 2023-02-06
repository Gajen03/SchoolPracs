/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class FiveNums {
    public static void main(String[] args) {
        
        int[] fiveNumbers = {1,6,3,8,5};
//        int sum = 0;
//        double avg = 0;
//        for(int i = 0 ; i < fiveNumbers.length ;i++){
//            sum  += fiveNumbers[i];
//        }
//        avg = sum/fiveNumbers.length;
//        System.out.println("Average: "+avg);
//        
      int largestnum = 0;
      int currentNum = 0;
      int lowestnum = 0;
      for(int i = 0 ;i< fiveNumbers.length;i++){
          currentNum = fiveNumbers[i];
          
          
          if(currentNum > largestnum){
              largestnum = currentNum;
          }
          
           lowestnum = currentNum;
          if(currentNum<lowestnum){
              lowestnum = currentNum;
          }
      }
        System.out.println("Largest Num: "+largestnum);
        System.out.println("Lowest Num: "+lowestnum);
        
    }
   
}
