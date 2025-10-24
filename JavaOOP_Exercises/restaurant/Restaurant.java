package restaurant;

import java.util.HashMap;
import java.util.ArrayList;

public class Restaurant {
    private HashMap<String, Double> menu = new HashMap<>();
    private ArrayList<Integer> ratings = new ArrayList<>();

    public void addItem(String item, double price) {
        menu.put(item, price);
        System.out.println("[ Item \"" + item + "\" added. ]");
    }

    public void removeItem(String item) {
        if (menu.containsKey(item)) {
            menu.remove(item);
            System.out.println("[ Item \"" + item + "\" removed. ]");
        } else System.out.println("[ Item not found! ]");
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        double total = 0;
        for (int r : ratings) total += r;
        return total / ratings.size();
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (String item : menu.keySet()) {
            System.out.println("\t" + item + " - $" + menu.get(item));
        }
        System.out.println("Average Rating: " + getAverageRating());
    }
}
