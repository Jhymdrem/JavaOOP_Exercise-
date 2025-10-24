package course;

public class Course {
    protected String name;
    protected String instructor;
    protected int credits;

    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println("Course: " + name);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}
