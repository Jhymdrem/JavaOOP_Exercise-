package movie;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors = new ArrayList<>();
    private ArrayList<String> reviews = new ArrayList<>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayInfo() {
        System.out.println("Movie: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors:");
        for (String actor : actors) {
            System.out.println("\t " + actor);
        }
        System.out.println("Reviews:");
        for (String review : reviews) {
            System.out.println("\t " + review);
        }
        System.out.println();
    }
}
