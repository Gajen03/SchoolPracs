/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Charcters;

import javax.swing.JOptionPane;

/**
 *
 * @author Gajendran
 */
public class IsolateChars {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter Word");
        
        // gets first and last letter 3.2
//        char firstLet = word.charAt(0);
//        char lastLet = word.charAt(word.length()-1);
//        System.out.println("First Letter: "+firstLet+"\nLast Letter: "+lastLet);
//        System.out.println("First Letter: ");

////        3.3
//          System.out.print("Word Backwards  ");
//          for(int i = word.length()-1;i>=0;i--){
//              System.out.print(word.charAt(i));
//          }
      //     3.4
//            char firstLet = word.charAt(0);
//            char lastLet = word.charAt(word.length()-1);
//            char secLetter = word.charAt(1);
//            char seclastLet = word.charAt(word.length()-2);
//      
//            System.out.println(""+firstLet+"\n"+lastLet+"\n"+secLetter+"\n"+seclastLet);

//         3.5
//           int len = word.length();
//           
//           if(len%2 != 0){
//               int midLetterInt = len/2;
//               char midLetter = word.charAt(midLetterInt);
//               System.out.println("Mid letter: "+midLetter);
//           }else{
//               int midLetterInt = len/2;
//               char midLetter = word.charAt(midLetterInt-1);
//               char midLetter2 = word.charAt(midLetterInt);
//               System.out.println("Mid Letter: "+midLetter+""+midLetter2);
//           }
           
             int len = word.length();
        System.out.print("Word vowels: ");
        for (int i = 0; i >= len; i++) {

            String wordChar = "" + word.charAt(i);
            if (wordChar.equalsIgnoreCase("a") || wordChar.equalsIgnoreCase("e") || wordChar.equalsIgnoreCase("i") || wordChar.equalsIgnoreCase("o") || wordChar.equalsIgnoreCase("u")) {
                System.out.print(wordChar);
            }

        }
    }

}

