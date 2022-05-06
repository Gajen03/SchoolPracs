/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_Charcters;

/**
 *
 * @author Gajendran
 */
public class GScanner {
    private String s;
    private char delimeter = ' ';
    private int postition = 0;
    
    public GScanner(String inputS){
        s = inputS;
    }
    
    public String next(){
        String word = s.substring(0,s.indexOf(delimeter));
        postition = Integer.parseInt(s);
        return word;
    }
    
//    public int nextInt(){
//        
//    }
    //next()
    //nextInt()
    //nextDouble()
    //setDelilmeter()
         
}
