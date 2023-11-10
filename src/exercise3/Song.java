/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise3;

/**
 *
 * @author sethl
 */
public class Song {
    private final String title;
    private final int length;
    private int listens;
    private final String releaseDate;
    
    public Song(String title, int length, int listens, String releaseDate){
        this.title = title;
        this.length = length;
        this.listens = listens;
        this.releaseDate  = releaseDate;
        
        System.out.println("New song! " + title + " (" + releaseDate + ")");
    }
    
    public void addListens(int newListens){
        listens += newListens;
    }
    
    public int getListens(){
        return listens;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getLength(){
        return length;
    }
    
    public String getReleaseDate(){
        return releaseDate;
    }
}
  