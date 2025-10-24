package pet;

public class PetMain {
    public static void main(String[] args) {
        System.out.println("""
                PET SYSTEM
                =========================================
                """);

        Dog dog = new Dog("Buddy", 3, "Rubber Ball");
        Bird bird = new Bird("Chirpy", 2, 25.5);

        dog.displayDetails();
        System.out.println();
        bird.displayDetails();
    }
}
