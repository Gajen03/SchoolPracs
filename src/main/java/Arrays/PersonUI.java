/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gajendran
 */
public class PersonUI {
    public static void main(String[] args) {
        try {
            PersonArray p = new PersonArray();
            
            p.print();
                    
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(PersonUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
