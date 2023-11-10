/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

/**
 *
 * @author sethl
 */
public class Singer {
    private final String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        
        System.out.println("New singer! " + name + " with favorite song " + favoriteSong.getTitle());
    }
    
    public Singer(String name, Song favoriteSong){
        this(name, 0, 0, favoriteSong);
    }
    
    /**
     * Changes the singers favorite song into a new one
     * @param newSong the singers new favorite song
     */
    public void changeFavSong(Song newSong){
        System.out.println("Changed favorite song of " + this.name + " from " + this.favoriteSong.getTitle()  + " to " + newSong.getTitle());
        
        this.favoriteSong = newSong;
    }
    
    /**
     * Preform for an audience. Increases the noOfPreformaces by 1 and the 
     * earnings by 500 * attendees
     * @param attendees number of people attending the performance
     */
    public void performForAudience(int attendees){
        this.noOfPerformances++;
        this.earnings += attendees * 500;
        Singer.totalPerformances++;
        
        System.out.println(this.name + " preformed for an audience of " + attendees);
    }
    
    /**
     * Preform for an audience with another singer. Increases the noOfPreformances by 1
     * for both singers and the earnings are split 50-50 between them
     * @param attendees number of people attending the performance
     * @param otherSinger the other singer to preform with
     */
    public void performForAudience(int attendees, Singer otherSinger){
        this.noOfPerformances++;
        this.earnings += attendees * 500 / 2;
        
        otherSinger.noOfPerformances++;
        otherSinger.earnings += attendees * 500 / 2;
        
        Singer.totalPerformances += 2;
        
        System.out.println(this.name + " preformed for an audience of " + attendees + " with " + otherSinger.name);
    }
    
    public String getName(){
        return this.name;
    }
    
    public Song getFavoriteSong(){
        return this.favoriteSong;
    }
    
    public int getNoOfPreformaces(){
        return this.noOfPerformances;
    }
    
    public double getEarnings(){
        return this.earnings;
    }
    
    public static int getTotalPreformances(){
        return Singer.totalPerformances;
    }
}