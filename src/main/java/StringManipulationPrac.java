
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SWG_T28
 */
public class StringManipulationPrac {
    public static void main(String[] args) {
        // Question 1 
//        String name = JOptionPane.showInputDialog("Enter Name");
//        String alphaName = name;
//        
//        for(int i = 0;i<4;i++){
//            if(name.compareTo(alphaName)< 0){
//                alphaName = name;
//            }
//            name = JOptionPane.showInputDialog("Enter Name");
//            
//        }
//        System.out.println("Most Alpha Name: "+alphaName);
            

//       Question 2
//        String word = JOptionPane.showInputDialog("Enter word");
//        System.out.println("Word: "+word);
//        String unwanted = JOptionPane.showInputDialog("Enter unwated chars");
//        
//        String output = "";
//        for(int i =0; i<word.length();i++){
//            String currentChar = ""+word.charAt(i);
//            
//            if(!currentChar.contains(unwanted)){
//                output += currentChar;
//            }
//        }
//        System.out.println("New Word: "+output);
//

//       Question 3
//        String word = JOptionPane.showInputDialog("Enter word");
//        System.out.println("word: "+word);
//        String output = "";
//        for(int i = 0 ; i<word.length();i++){
//            char currentChar = word.charAt(i);
//            
//            if(Character.isUpperCase(currentChar)){
//            String currentCharStr = ""+ word.charAt(i);
//            output += currentCharStr.toLowerCase();
//            }
//            
//            if(Character.isLowerCase(currentChar)){
//            String currentCharStr = ""+ word.charAt(i);
//            output += currentCharStr.toUpperCase();
//            }
//        }
//        System.out.println("Filped: "+ output);
//        


//        question 4
//        String fullName = JOptionPane.showInputDialog("Enter Full Name");
//        
//        String name = fullName.substring(0,fullName.indexOf(" "));
//        String surname = fullName.substring(fullName.lastIndexOf(" "));
//        
//        System.out.println("Email: "+name+"."+surname+"@reddam.house");
//        
         String word = JOptionPane.showInputDialog("Enter Full Name");
         System.out.println("Word: "+word);
         String nextWord = ""+word.charAt(0);
         int count = 0;
         
         while(word.charAt(word.length()-1)==nextWord.charAt(0)){
             count ++;
             nextWord = word;
             word = JOptionPane.showInputDialog("Enter Full Name");
             System.out.println("Word: "+word);
             
         }
         System.out.println("Points: "+count);

    }
}
