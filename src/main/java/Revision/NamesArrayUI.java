/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revision;

import java.io.FileNotFoundException;

/**
 *
 * @author SWG_T28
 */
public class NamesArrayUI {
    public static void main(String[] args) throws FileNotFoundException {
        
        NamesArray na = new NamesArray();
        
        System.out.println(na.toString());
        na.sort();
        System.out.println(na.toString());
        na.insert("Callie");
        System.out.println(na.toString());
        na.delete("Callie");
        na.insert("Carrie");
        System.out.println(na.toString());
    }
}
