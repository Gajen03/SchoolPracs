/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance2;

import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;

/**
 *
 * @author Gajendran
 */
public class AnimalUI {
    public static void main(String[] args) {
        
//        Dog d = new Dog(20,1,90);
//        
//        System.out.println(d.getWeight());
//        d.eatBone();
//        System.out.println(d.getWeight());
//        System.out.println(d.speaks(100000));
    
        Animal []animal = new Animal[5];
        animal[0] = new Dog(13,1.3,99);
        animal[1] = new Dog(14,1.5,87);
        animal[2] = new Cat(13,1.8,73);
        animal[3] = new Dog(19, 1.6, 90);
        animal[4] = new Dog(12, 1.4, 67);

        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Dog) {

                ((Dog) animal[i]).eatBone();

            } else if (animal[i] instanceof Cat) {

                ((Cat) animal[i]).scratch();
            }

        }
        
    }
}
