package student;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<Course> course = new ArrayList<>();

    public Student(String name, int gradeLavel, Course newCourse) {
        this.name = name;
        this.grade = gradeLavel;
        this.course.add(newCourse);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void addNewCourse(Course newCourse) {
        this.course.add(newCourse);
        System.out.println("[ " + newCourse.getCourse() + ": successfully added! ]");
    }

    public void removeCourse(String courseName) {
        for (Course core : course) {
            if (courseName.equals(core.getCourse())) {
                course.remove(course.indexOf(core));
                System.out.println("[ " + courseName + ": successfully removed! ]");
                return;
            }
        }
        System.out.println("[ " + courseName + ": not found! ]");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nGrade Lavel: " + grade + "\nCourses: ");

        for (Course core : course) {
            System.out.println('\t' + core.getCourse());
        }
    }

}
