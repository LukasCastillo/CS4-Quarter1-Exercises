package exercise2;

/**
 *
 * @author sethl
 */
public class Exercise2 {

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
        
        Singer singer = new Singer("Bob", song1);
        singer.performForAudience(12);
        singer.changeFavSong(song2);
    }
    
}
