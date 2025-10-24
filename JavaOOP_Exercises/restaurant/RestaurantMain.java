package restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        System.out.println("""
                RESTAURANT SYSTEM
                =========================================
                """);

        Restaurant restaurant = new Restaurant();
        restaurant.addItem("Burger", 5.99);
        restaurant.addItem("Pizza", 8.49);
        restaurant.addRating(4);
        restaurant.addRating(5);
        restaurant.displayMenu();
        restaurant.removeItem("Pizza");
        restaurant.displayMenu();
    }
}
