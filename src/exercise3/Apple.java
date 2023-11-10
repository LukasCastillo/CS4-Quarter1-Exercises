/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

/**
 *
 * @author sethl
 */
public class Apple {
    private boolean hasWorm;
    private String color;
    private int weight;
    
    public Apple(String color, int weight, boolean hasWorm){
        this.color = color;
        this.weight = weight;
        this.hasWorm = hasWorm;
        
        System.out.println("Apple with color " + color + " created!");
    }
    
    public Apple(){
        this("Red", 10, false);
    }

    public boolean hasWorm() {
        return hasWorm;
    }

    public void removeWorm() {
        this.hasWorm = false;
    }
    
    public void addWorm(){
        this.hasWorm = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
