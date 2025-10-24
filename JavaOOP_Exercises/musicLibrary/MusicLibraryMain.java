package musicLibrary;

public class MusicLibraryMain {
    public static void main(String[] args) {
        System.out.println("""
                MUSIC LIBRARY
                =========================================
                """);

        MusicLibrary library = new MusicLibrary();

        library.addSong(new Song("Dusk Till Dawn", "ZAYN ft. Sia"));
        library.addSong(new Song("Blinding Lights", "The Weeknd"));
        library.addSong(new Song("Until I Found You", "Stephen Sanchez"));
        System.out.println();

        library.displayAllSongs();
        System.out.println();

        library.playRandomSong();
        library.playRandomSong();
        System.out.println();

        library.removeSong("Blinding Lights");
        library.displayAllSongs();
        System.out.println();
        
        library.playRandomSong();
    }
}
