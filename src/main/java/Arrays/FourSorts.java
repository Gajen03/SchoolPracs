/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class FourSorts {
    public static void main(String[] args) throws FileNotFoundException {
        
        String filepath = "data//numbers.txt";
        File f = new File(filepath);
        int number = 0;
        
        int[] numberArr = new int[10];
        Scanner fileScanner = new Scanner(f);
        int i = 0;
        while (fileScanner.hasNext()) {
            number = fileScanner.nextInt();
            numberArr[i] = number;
            i++;
        }
        
        
        BubbleSort(numberArr);
       
       
     //   System.out.println( "\n"+Search(numberArr, 6));
        System.out.println( "\n"+BinarySearch(numberArr, 11));
        
    }
    
    
    public static void BubbleSort(int[] arr){
        for(int sortedIndex = arr.length-1;sortedIndex>0;sortedIndex--){
            for(int currentIndex = 0; currentIndex< sortedIndex; currentIndex++){
                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                }
            
            }
        }
    }
    
    
    public static int Search(int[] arr, int search){
        for(int currentIndex = 0; currentIndex< arr.length-1; currentIndex++){
            if(currentIndex == search){
                return search;
            }
        }
        return -1;
    }
    
        public static int BinarySearch(int arr[], int search) {

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            int midindex = (startIndex + endIndex) / 2;

            if (arr[midindex] == search) {
                return midindex;
            } else if (arr[midindex] > search) {
                endIndex = midindex - 1;
            } else if (arr[midindex] < search) {
                startIndex = midindex + 1;
            }

        }
        return -1;
    }

     public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
