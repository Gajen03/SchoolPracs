/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gajendran
 */
public class Dog extends Animal{
    private int loyalty ;
    
    public Dog(double weight, double height,int loyalty) {
        // super has to the first line of the constructor
        super(weight, height,4);
        
        if(loyalty >= 0 && loyalty <= 100){
             this.loyalty = loyalty;    
        }else if(loyalty<0){
            this.loyalty = 0;
        }else if(loyalty>100){
            this.loyalty = 100;
        }
    }
    
    public void eatBone(){
        this.weight += 1;
    }
    
    
    @Override
    public String speak(){
        return "WOOF";
    }
    
    public String speak(int num){
        String output = "";
        for(int i = 0;i<num;i++){
            output+= "WOOF";
        }
        return output;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    
    
    
}
