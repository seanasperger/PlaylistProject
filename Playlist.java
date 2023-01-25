import java.util.ArrayList;
/**
 * Write a description of class Playlist here.
 *
* @author (Sean Asperger)
 * @version (2023-01-20)
 */
public class Playlist
{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    private int playlistTime;
    /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        // initialise instance variables
        playlist = new ArrayList<Song>();
        playlistTime = 0;
    }

    /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      
      
      
    public void add(Song song) // adds a song to playlist
    {
        // put your code here
        playlist.add(song);
    }
    
    public void remove(int position) // removes the song from playlist
    {
        // put your code here
        playlist.remove(playlist.get(position));
    }
    
    public void like(int position) //likes a song
    {
        // put your code here
        if (playlist.get(position).isLiked() == true)
            System.out.println("Song is already liked!");
        else
            playlist.get(position).like();    
    }
    
    public void print() //prints out entire playlist 
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            System.out.println(playlist.get(i).toString());
        }
    }
    
    public void printLiked() //prints out all liked songs
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).isLiked() == true)
                System.out.println(playlist.get(i).toString());
        }
    }
    
    public void removeUnliked() //removes all unliked songs from playlist
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).isLiked() == false)
                playlist.remove(i);
        }
    }
    
    public void playlistTime() //prints out time of the playlist
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            playlistTime += playlist.get(i).getTime();
        }
        int minutes = playlistTime / 60;
        int seconds = playlistTime % 60;
        String playlistTime = String.valueOf(minutes) + ":" + String.valueOf(seconds);
        System.out.println(playlistTime);
    }
    
}
