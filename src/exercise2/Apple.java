/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author sethl
 */
public class Apple {
    boolean hasWorm;
    String color;
    int weight;
    
    public Apple(String color, int weight, boolean hasWorm){
        this.color = color;
        this.weight = weight;
        this.hasWorm = hasWorm;
        
        System.out.println("Apple with color " + color + " created!");
    }
    
    public Apple(){
        this("Red", 10, false);
    }
}