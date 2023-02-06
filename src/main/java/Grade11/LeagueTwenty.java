/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grade11;

import javax.swing.JOptionPane;

/**
 *
 * @author SWG_T28
 */
public class LeagueTwenty {
    public static String currentPlayerName = "";
    public static double currentPlayerAvg ;
    public static double currentPlayerFifties ;
    
    public static void main(String[] args) {
        int numNames = 0;
        System.out.println("=========================\nPLAYER STATS\n=========================");
        currentPlayerName = JOptionPane.showInputDialog("Enter Player Name");
        while(!currentPlayerName.equalsIgnoreCase("xxx")){
            numNames ++;
            System.out.println("NAME: "+ currentPlayerName);
            code(currentPlayerName);
            generatePlayer();
            System.out.println("\n");
            currentPlayerName = JOptionPane.showInputDialog("Enter Player Name");
            
        }
        System.out.println("\n\n");
        System.out.println("=========================TEAM STATS=========================");
        System.out.println("MVP: ");
        System.out.println("MVP Names: ");
    }
    
    public static void generatePlayer() {
        double playerExperience = (int) (Math.random() * (4 - 1)) + 1;
        if (playerExperience == 1) {
            System.out.println("EXP: junior");
            
        } else if (playerExperience == 2) {
            System.out.println("EXP: senior");
        } else {
            System.out.println("EXP: expert");
        }
        
        int playerScore = 0;
        int sumScore = 0;
        String nom = "";
        int nomCount = 0;
        for (int i = 0; i >= 5; i++){
            System.out.println("hi");
            if (playerExperience == 1) {
                playerScore = (int)(Math.random() * (50 - 0)) + 0;
                sumScore += playerScore;
            } else if (playerExperience == 2) {
                playerScore = (int)(Math.random() * (100 - 0)) + 0;
                sumScore += playerScore;
            } else {
                playerScore = (int)(Math.random() * (150 - 0)) + 0;
                sumScore += playerScore;
            }
            currentPlayerAvg = sumScore / 5;
            if(playerScore>= 50){
                currentPlayerFifties = currentPlayerFifties+ 1;
            }else{
                currentPlayerFifties = 0;
               
            }
            
            if(currentPlayerFifties>=3){
                 nom = "true";
                 nomCount ++;
            }else{
                 nom = "false";
            }
        }
        System.out.println("AVG: " + currentPlayerAvg);
        System.out.println("NOM: " + nom);
    
    }

    public static String code(String name) {

        String nameCode = name.toUpperCase();
        int codeLen = nameCode.length();
        char codeChar1 = nameCode.charAt(0);
        char codeChar2 = nameCode.charAt(1);
        char codeChar3 = nameCode.charAt(2);

        System.out.println("CODE: " + codeChar1 + "" + codeChar2 + "" + codeChar3 + "" + codeLen);
        return null;

    }
}
