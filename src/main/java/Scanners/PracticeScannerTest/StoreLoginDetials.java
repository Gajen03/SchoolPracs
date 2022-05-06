/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners.PracticeScannerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jdk.internal.net.http.common.Utils.stackTrace;

/**
 *
 * @author Gajendran
 */
public class StoreLoginDetials {

    public static void main(String[] args) throws IOException {

        String filepath = "data//loginDetails.txt";
        File f = new File(filepath);
        String username = "";
        String password = "";
        int totalLogins = 0;

        try {

            username = JOptionPane.showInputDialog("Enter username");
            password = JOptionPane.showInputDialog("Enter password");

            String output = "";
            while (!username.equalsIgnoreCase("stop")) {
                totalLogins++;
                output += username + "#" + password + "\n";

                username = JOptionPane.showInputDialog("Enter username");
                password = JOptionPane.showInputDialog("Enter password");

            }

            FileWriter fw = new FileWriter(filepath, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(output);
            pw.close();
            System.out.println("Number of logins entered: " + totalLogins);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(StoreLoginDetials.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
