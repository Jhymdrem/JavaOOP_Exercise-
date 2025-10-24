package pet;

public class Pet {
    protected String name;
    protected String species;
    protected int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Species: " + species + ", Age: " + age);
    }

    public int calculateHumanAge() {
        return age * 7;
    }
}
