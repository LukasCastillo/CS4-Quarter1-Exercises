/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise3;

/**
 *
 * @author sethl
 */
public class Exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apple defaultApple = new Apple();
        Apple weirdApple = new Apple("limegreen", 40, true);
        Apple clearApple = new Apple("white", 1, false);
        System.out.println();
        
        Song song1 = new Song("Real Song", 100, 100000, "Jun 28 2007");
        Song song2 = new Song("Realer Song", 325, 9888884, "Sep 21 2012");
        System.out.println();
        
        Singer bobSinger = new Singer("Bob", song1);
        Singer aliceSinger = new Singer("Alice", song2);
        bobSinger.performForAudience(12);
        bobSinger.changeFavSong(song2);
        aliceSinger.performForAudience(12, bobSinger);
        
        System.out.println();
        System.out.println("Total Preformances: " + Singer.getTotalPreformances());
        System.out.println("Bob's Earnings: " + bobSinger.getEarnings() + "$");
        System.out.println("Alice's Earnings: " + aliceSinger.getEarnings() + "$");
    }
    
}
