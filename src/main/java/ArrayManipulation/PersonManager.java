/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gajendran
 */
public class PersonManager {
    
    private Person[] pArr = new Person[100];
    private int size = 0;
    String filePath = "data\\people.txt";
    File f = new File(filePath);
    public PersonManager() throws FileNotFoundException {
        
        
        Scanner fileScanner = new Scanner(f);
        
        while(fileScanner.hasNext()){
            String line = fileScanner.nextLine();
            Scanner lineSc = new Scanner(line).useDelimiter("#");
            String name = lineSc.next();
            String surname = lineSc.next();
            int age = lineSc.nextInt();
            
            pArr[size] = new Person(name, surname, age);
            size++;
        }
    }

    @Override
    public String toString() {
        String output = "";
        
        for(int i = 0;i<size;i++){
            output += pArr[i]+"\n";
        }
        
        return output;
    }
    
    
    
    public int search(String person){
       int lowest = 0;
       int highest = size - 1;
       
       while(lowest<=highest){
           int mid = (highest-lowest)/2;
           
           if (person.compareTo(pArr[mid].getName())>0){
               lowest = mid + 1;
           }else if(person.compareTo(pArr[mid].getName())<0){
               highest = mid - 1;
           }else{
               return mid;
           }
       }
       return -1;
       
    }
    
    public void nameSort(){
        //selection sort
        for(int sorted = 0;sorted<size-1;sorted++){
            for(int currentIndex = sorted+1;currentIndex<size;currentIndex++){
                
                
                Person temp = pArr[currentIndex];
                pArr[currentIndex] = pArr[currentIndex +1];
                pArr[currentIndex +1] = temp;
            }
        }
    }
    
    public void ageSort(){
        // bubble sort
        for (int sortedIndex = pArr.length - 1; sortedIndex > 0; sortedIndex--) {
            for (int currentIndex = 0; currentIndex < 0; currentIndex++) {
                
                Person temp = pArr[currentIndex];
                pArr[currentIndex]= pArr[currentIndex + 1];
                pArr[currentIndex + 1] = temp;
            }

        }
    
    }

    public void addPerson(String name,String surname,int age){
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name+"#"+surname+"#"+age+"#");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(PersonManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePerson(String name) {
        int index = search(name);

        for (int i = 0; i < size; i++) {

            pArr[i] = pArr[i + 1];

        }
        size--;
    }


}
        
