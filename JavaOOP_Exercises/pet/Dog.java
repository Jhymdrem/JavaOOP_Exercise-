package pet;

public class Dog extends Pet {
    private String favoriteToy;

    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Human Age: " + calculateHumanAge());
    }
}
