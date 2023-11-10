/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author sethl
 */
public class Song {
    String title;
    int length;
    int listens;
    String releaseDate;
    
    public Song(String title, int length, int listens, String releaseDate){
        this.title = title;
        this.length = length;
        this.listens = listens;
        this.releaseDate  = releaseDate;
        
        System.out.println("New song! " + title + " (" + releaseDate + ")");
    }
}
  