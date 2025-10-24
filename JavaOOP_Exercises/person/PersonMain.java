package person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("JhydrenMG", 19);
        Person person2 = new Person("RmenJhyd", 19);

        System.out.println("""
                PERSON
                =====================================
                Person's Name   |   Age
                =====================================
                """);
        System.out.println(person.getName() + "\t\t" + person.getAge());
        System.out.println(person2.getName() + "\t\t" + person2.getAge());
    }
}
