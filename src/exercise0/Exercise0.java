/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise0;

/**
 * Ex1_Tau_Castillo
 * @author sethl
 */
public class Exercise0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean appleHasWorm = false;
        String appleColor = "Red";
        int appleWeight = 10;

        boolean weirdAppleHasWorm = true;
        String weirdAppleColor = "LimeGreen";
        int weirdAppleWeight = 40;
        
        boolean cleanAppleHasWorm = false;
        String cleanAppleColor = "White";
        int cleanAppleWeight = 1;
        
        System.out.println("Normal Apple");
        System.out.println("Has Worm: " + appleHasWorm);
        System.out.println("Color: " + appleColor);
        System.out.println("Weight: " + appleWeight);
        System.out.println();
        
        System.out.println("Weird Apple");
        System.out.println("Has Worm: " + weirdAppleHasWorm);
        System.out.println("Color: " + weirdAppleColor);
        System.out.println("Weight: " + weirdAppleWeight);
        System.out.println();
        
        System.out.println("Clean Apple");
        System.out.println("Has Worm: " + cleanAppleHasWorm);
        System.out.println("Color: " + cleanAppleColor);
        System.out.println("Weight: " + cleanAppleWeight);
        System.out.println();
        
        int totalWeight = appleWeight + weirdAppleWeight + cleanAppleWeight;
        System.out.println("Total Weight: " + totalWeight);
        boolean oneHasWorm = appleHasWorm || weirdAppleHasWorm || cleanAppleHasWorm;
        System.out.println("One apple has a worm: " + oneHasWorm);
        
        String longestColor = "";
        String[] appleColors = {appleColor, weirdAppleColor, cleanAppleColor};
        
        for(String color : appleColors){
            if(color.length() > longestColor.length()) longestColor = color;
        }
        
        System.out.println("Longest Apple Color: " + longestColor);
    }
    
}
