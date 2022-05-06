/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Gajendran
 */
public class Sorting {

    public static void main(String[] args) {
        //            0,1,2,3,4,5,6, 7
        int[] num = {1, 3, 4, 5, 6, 2, 18, 9};

        improvedBubbleSort(num);
        Print(num);
        //arr[5] = 2;
    }

    public static void BubbleSort(int[] arr) {

        for (int sortedIndex = arr.length - 1; sortedIndex > 0; sortedIndex--) {
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {

                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                }

            }
        }
    }

    public static void improvedBubbleSort(int[] arr) {
        for (int sortedIndex = arr.length - 1; sortedIndex > 0; sortedIndex--) {
            boolean sorted = true;
            for (int currentIndex = 0; currentIndex < sortedIndex; currentIndex++) {

                if (arr[currentIndex] > arr[currentIndex + 1]) {
                    int temp = arr[currentIndex];
                    arr[currentIndex] = arr[currentIndex + 1];
                    arr[currentIndex + 1] = temp;
                    sorted = false;
                }

            }
            if (sorted) {
                break;
            }
        }
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
