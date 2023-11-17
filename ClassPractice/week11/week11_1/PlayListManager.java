package ClassPractice.week11.week11_1;

import java.util.ArrayList;
import java.util.List;

public class PlayListManager {

    private List<String> songs;

    public PlayListManager() {
        this.songs = new ArrayList<>();
    }

    // addSong

    /**
     * Function allows user to add a song to the playlist
     * @param song
     */
    private void addSong(String song) {
        songs.add(song);
    }

    // removeSong

    /**
     * Function allows user to remove a song from the playlist
     * @param song
     */
    private void removeSong(String song) {
        songs.remove(song);
    }

    // displaySong

    /**
     * Function displays all songs in the playlist
     */
    private void displaySong() {
        for (String song: songs) {
            System.out.println(song);
        }
    }

    // findSong

    /**
     * BONUS: Implement a search function
     * @param song
     * @return
     */

    private boolean findSong(String song) {
        return songs.contains(song);
    }

    public static void main(String[] args) {
        PlayListManager myPlaylist = new PlayListManager();
        myPlaylist.addSong("Song A");
        myPlaylist.addSong("Song B");
        myPlaylist.displaySong();
        myPlaylist.removeSong("Song A");
        myPlaylist.displaySong();
        System.out.println("Song Found: " + myPlaylist.findSong("Song B"));
    }




}
