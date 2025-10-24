package dog;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Butchoy", "Aspin");

        System.out.println("""
                DOG
                =================================
                Dog's Name  |   Breed
                =================================
                """);

        System.out.println("Before:" + '\n' + dog.getName() + "\t\t" + dog.getBreed() + '\n');

        dog.setName("Panpan");
        dog.setBreed("Padnak");

        System.out.println("After:" + '\n' + dog.getName() + "\t\t" + dog.getBreed());
    }
}
