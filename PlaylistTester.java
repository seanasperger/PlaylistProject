/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author (Sean Asperger)
 * @version (2023-01-20)
 */
public class PlaylistTester {
    public static void main(String[] args) 
    {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist rap = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        rap.add(new Song("16", "Baby Keem", 156));
        rap.add(new Song("Bound 2", "Kanye West", 227));
        rap.add(new Song("Already Home", "Jay-Z", 268));
        rap.add(new Song("Got Money", "Lil Wayne", 244));
        rap.add(new Song("No Church In The Wild", "Jay-Z + Kanye West + Frank Ocean + The-Dream", 272));
        rap.add(new Song("WISS", "Mike Dimes", 158));
        rap.add(new Song("Lord Knows", "Drake + Rick Ross", 307));
        rap.add(new Song("HardKnock", "Joey Bada$$ + CJ Fly", 318));
        rap.add(new Song("Hear Me Clearly", "Pusha T + Nigo", 261));
        rap.add(new Song("Pursuit Of Happiness (Nightmare)", "Kid Cudi + MGMT + RATATAT", 294));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        rap.print();

        System.out.println("\nLiking the songs in position 2, 3, 5, 6....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        rap.like(2);
        rap.like(3);
        rap.like(5);
        rap.like(6);
        System.out.println("Printing the songs...\n");
        rap.print();

        System.out.println("\nRemoving the song in position 9, etc...\n");
        rap.remove(9);

        System.out.println("Printing the songs...\n");
        rap.print();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        rap.printLiked();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        rap.playlistTime();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        rap.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        rap.print();
    }
}
