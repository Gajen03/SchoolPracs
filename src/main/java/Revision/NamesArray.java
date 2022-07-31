/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SWG_T28
 */
public class NamesArray {
    
    private String names[];
    private int size = 0;
    
    String filepath = "data\\names.txt";
    public NamesArray() throws FileNotFoundException{
        names = new String [100];
        
        File f = new File(filepath);
        Scanner sc = new Scanner(f);
        
        while(sc.hasNext()){
            String name = sc.nextLine();
            names[size] = name;
            size++;
        }
        sc.close();
    }

    @Override
    public String toString() {
        String output = " ";
        for (int i = 0; i < size - 1; i++) {
            output += names[i]+" ";
        }
        return output;
    }

    public void sort() {
        for (int sorted = size - 1; sorted >= 0; sorted--) {
            for (int currentIndex = 0; currentIndex < size - 1; currentIndex++) {
                if (names[currentIndex].compareTo(names[currentIndex + 1]) > 0) {
                    String temp = names[currentIndex];
                    names[currentIndex] = names[currentIndex + 1];
                    names[currentIndex + 1] = temp;
                }
            }
        }
    }

    public int search(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void shiftRight(int pos) {
        size++;
        for (int i = size - 1; i > pos; i--) {
            names[i] = names[i - 1];
        }
    }

    public void shiftLeft(int pos) {
        for (int i = pos; i < size - 1; i++) {
            names[i] = names[i + 1];
        }
        size--;
    }

    public void insert(String name) {
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if(names[i].compareTo(name)>0){
                pos = i;
                break;
            }
           
        }
           shiftRight(pos);
           names[pos] = name;
    }
    
    public void delete(String name){
        int pos = search(name);
        
        if(pos>=0){
            shiftLeft(pos);
        }
    }
}
