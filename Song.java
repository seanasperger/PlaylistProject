
/**
 * Write a description of class Song here.
 *
* @author (Sean Asperger)
 * @version (2023-01-20)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private String artist;
    private String name;
    private String length;
    private int time;
    private int minutes;
    private int seconds;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, String artist, int time)
    {
        // initialise instance variables
        this.artist = artist;
        this.name = name;
        this.time = time;
        liked = false;
    }

    /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    
     
    
    public String getName() // returns name of the song 
    {
        // put your code here
        return name;
    }
    public String getArtist() //returns who made the song -- i.e. the artist
    {
        // put your code here
        return artist;
    }
    public int getTime() //returns how long the song is in seconds
    {
        // put your code here
        return time;
    }
    public boolean isLiked() //returns if song is liked or not
    {
        // put your code here
        return liked;
    }
    public void like() //likes the song
    {
        // put your code here
        liked = true;
    }
    
    public String getLength() //returns how long the song is in minutes: seconds
    {
        minutes = time / 60;
        seconds = time % 60;
        if (String.valueOf(seconds).length() == 1)
            length = String.valueOf(minutes) + ":0" + String.valueOf(seconds);
        else 
            length = String.valueOf(minutes) + ":" + String.valueOf(seconds);
        return length;
    }
    /**
     * combines name, artist, length, and whether or not song is liked into 
     * a single string that can be displayed in one line
     * returns the string of all the song info
     */
    public String toString()
    {
        String toString = "";
        if (liked = true)
            toString = name + " by " + artist + " (" + getLength() + ") ~ liked ";
        else
            toString = name + " by " + artist + " (" + getLength() + ")";
        return toString;
    }
}
