package musicLibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    private ArrayList<Song> songs = new ArrayList<>();
    private Random random = new Random();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("[ Song \"" + song.getTitle() + "\" by " + song.getArtist() + " is successfully added! ]");
    }

    public void removeSong(String title) {
        for (Song song : songs) {
            if (title.equalsIgnoreCase(song.getTitle())) {
                songs.remove(song);
                System.out.println("[ Song \"" + title + "\" is successfully removed! ]");
                return;
            }
        }
        System.out.println("[ Song \"" + title + "\" is not found! ]");
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("[ No songs available to play! ]");
            return;
        }
        Song song = songs.get(random.nextInt(songs.size()));
        System.out.println("[ Now playing: \"" + song.getTitle() + "\" by " + song.getArtist() + " 🎧 ]");
    }

    public void displayAllSongs() {
        System.out.println("Songs in your library:");
        if (songs.isEmpty()) {
            System.out.println("\t[ No songs available! ]");
            return;
        }

        for (Song song : songs) {
            System.out.println("\t \"" + song.getTitle() + "\" by " + song.getArtist());
        }
    }
}
