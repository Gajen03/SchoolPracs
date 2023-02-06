/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Gajendran
 */
public class UseLine {

    private int size;
    private char pattern;

    public UseLine() {
        size = 2;
        pattern = '*';
    }

    public UseLine(int s, char p) {
        size = s;
        pattern = p;
    }
    
    public void setSize(int s){
        size = s;
    }
    public void setPattern(char p){
        pattern = p;
    }

    public void draw() {
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);

        }
        System.out.println();
    }

    public void drawVert() {
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
            System.out.println(pattern);
        }

    }
}
