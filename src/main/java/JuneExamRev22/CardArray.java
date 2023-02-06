/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuneExamRev22;

import Arrays.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gajendran
 */
public class CardArray {
    private Card[] cArr = new Card[20];
    private int size;

    public CardArray(){
    
        try {
            String filepath = "data//cards";
            File f  = new File(filepath);
            
            Scanner fileSc = new Scanner(f);
            while(fileSc.hasNext()){
                String line = fileSc.nextLine();
                
                Scanner lineSc = new Scanner(line);
                lineSc.useDelimiter(";");
                String name = lineSc.next();
                String type = lineSc.next();
                int basic = lineSc.nextInt();
                int special = lineSc.nextInt();
                int leader = lineSc.nextInt();
                int unique = lineSc.nextInt();
                
                cArr[size] = new  Card(name,type,basic,special,leader,unique);
                size++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
    }
    
    public void sort(){
        for(int sorted = cArr.length - 1;sorted<0;sorted--){
            for(int currentIndex = 0;currentIndex>sorted;currentIndex++){
                
                if(){
                    
                }
                
            }
        }
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < size; i++) {
            output += cArr.toString();
        }
        return output;
    }

    

    
    
}
