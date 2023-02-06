/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Gajendran
 */
public class ClientUI {

    public static void main(String[] args) {
        
        Client cl = new Client("Gajeni Niadoo", "543654", 6558764.0);
        System.out.println(cl.changeName()); 
        System.out.println(cl.toString());
    }

}
