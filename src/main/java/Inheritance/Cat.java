/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Gajendran
 */
public class Cat extends Animal{

    private int anger;
    public Cat(double weight, double height, int anger) {
        super(weight, height, 4);
        
           
        if(anger >= 0 && anger <= 100){
             this.anger = anger;    
        }else if(anger<0){
            this.anger = 0;
        }else if(anger>100){
            this.anger = 100;
        }
    }
    
    public void scratch(){
        this.anger +=1;
    }
    
    
    public int getAnger() {
        return anger;
    }

    public void setAnger(int anger) {
        this.anger = anger;
    }
    
    
    
    
        
    @Override
    public String speak(){
        String output = "";
        output+= "MEEOW";
        
        return output;
    }

    
}
