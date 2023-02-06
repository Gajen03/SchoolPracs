/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners.PracticeScannerTest;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Gajendran
 */
public class ExtractDomain {
    public static void main(String[] args) {
        String file = "data//websites.txt";
        File f = new File(file);
        
        String www = "";
        String domain = "";
        int totalWebsitesProcessed = 0;
        int counter = 0;
        try {
            Scanner fileScanner = new Scanner(f);
             

            while (fileScanner.hasNext()) {
                Scanner lineScanner = new Scanner(fileScanner.nextLine());
                lineScanner.useDelimiter("[.]");
                www = lineScanner.next();
                domain = lineScanner.next();
                counter++;
                totalWebsitesProcessed ++;
                System.out.println("Domain "+counter+" : "+domain); 
                lineScanner.close(); 
                
            }
            fileScanner.close();
            System.out.println("Websites processed: "+totalWebsitesProcessed);
        } catch (Exception e) {
               e.printStackTrace();
        }
        
        
    }
}
