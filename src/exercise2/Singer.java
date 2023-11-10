/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author sethl
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        
        System.out.println("New singer! " + name + " with favorite song " + favoriteSong.title);
    }
    
    public Singer(String name, Song favoriteSong){
        this(name, 0, 0, favoriteSong);
    }
    
    public void changeFavSong(Song newSong){
        System.out.println("Changed favorite song of " + this.name + " from " + this.favoriteSong.title  + " to " + newSong.title);
        
        this.favoriteSong = newSong;
    }
    
    public void performForAudience(int attendees){
        this.noOfPerformances++;
        this.earnings += attendees * 500;
        
        System.out.println(this.name + " preformed for an audience of " + attendees);
    }
}
