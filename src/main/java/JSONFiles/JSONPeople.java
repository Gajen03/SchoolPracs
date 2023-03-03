/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSONFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONArray;

/**
 *
 * @author Gajendran
 */

////// javascript array
// var{1,2,3,4}
// var person{
//          "id":3,
//        "name":"Murray",
//        "surname":"Yoko"

// }

/// java array
// you know what that is
public class JSONPeople {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        File f = new File("\\people.json");
        Scanner sc = new Scanner(f);
        String file = "";
        while(sc.hasNext()){
            file += sc.nextLine();
        }
        
        
            
        JSONArray jArr = new JSONArray(file);
       
        System.out.println(jArr.getJSONObject(1).get("name"));
        
    }

           
}
