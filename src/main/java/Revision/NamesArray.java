/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class NamesArray {
    
    private String name[];
    private int size = 0;
    
    String filePath = "data\\names";
    File f = new File(filePath);
    
    public NamesArray() throws FileNotFoundException {
        name = new String[100];
        
        Scanner sc = new Scanner(f);
                
        while(sc.hasNext()){
            String name = sc.nextLine();
            sc.close();
            
            this.name[size] = name;
            size++;
        }
       
    }

    @Override
    public String toString() {
        return "" + "Name: " + name + "\n" +'}';
    }
    
    public void sort(){
        
        for(int sorted = name.length-1;sorted>0;sorted--){
            for(int currentIndex = 0; currentIndex<sorted;currentIndex++){
                if (name[size].compareTo(name[size - 1]) > 0) {
                    String temp = name[size];
                    name[size] = name[size - 1];
                    name[size - 1] = temp;
                }
            }
        }
    }

    public int search(String name) {
        int lowest = 0;
        int highest = size;

        while (lowest <= highest) {
            int mid = (highest - lowest) / 2;

            if (name.compareTo(this.name[mid]) > 0) {
                highest = mid - 1;
            } else if (name.compareTo(this.name[mid]) < 0) {
                lowest = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
    public void shiftMore(int p) {
        size++;
        //for add method
        for (int i = size; i > p; i--) {
            name[i] = name[i - 1];
            if(size == 0){
                break;
            }
        }
    }
    public void insert(String name) throws IOException{
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);
        
        int pos = 0;
        while(name.compareTo(this.name[pos])<0){
            pos++;
        }
        shiftMore(pos);
    }


    
    
}
