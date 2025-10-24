package movie;

public class MovieMain {
    public static void main(String[] args) {
        System.out.println("""
                MOVIE LIBRARY
                =========================================
                """);

        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addReview("Mind-blowing and visually stunning!");
        movie.addReview("Excellent direction and storyline.");
        movie.displayInfo();
    }
}
