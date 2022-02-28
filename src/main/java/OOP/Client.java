/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Gajendran
 */
public class Client {

    private String clientname;
    private String accontNumber;
    private double balance;

    public Client(String inName, String inNumber, double inAmount) {
        clientname = inName;
        accontNumber = inNumber;
        balance = inAmount;
    }

    public void setName(String name) {
        clientname = name;
    }

    public String getName() {
        return clientname;
    }

    public String changeName() {
        String currentName = getName();
        String surname = currentName.substring(currentName.lastIndexOf(" ") + 1);
        String initial = "" + currentName.charAt(0);
        String nameChanged = surname +"."+ initial;
        return nameChanged;
    }

    public void newAccountNumber(String newAccountNumber) {
        accontNumber = newAccountNumber;
    }

    public void newBalance(double newBalance) {
        balance = newBalance;
    }
    
    public String toString(){
        return changeName()+", Balance = " + balance + ", Account Number = "+accontNumber;
    }

}
