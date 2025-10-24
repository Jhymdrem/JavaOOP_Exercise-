package student;

public class StundentMain {
    public static void main(String[] args) {
        Course course = new Course("English");
        Course course2 = new Course("Scince");
        Course course3 = new Course("Mathimatics");

        System.out.println("""
                STUDENT'S COURSES
                ===============================
                """);
        Student student = new Student("JhymdrenMG", 12, course);
        student.displayInfo();
        System.out.println();

        student.addNewCourse(course2);
        student.displayInfo();
        System.out.println();

        student.removeCourse("English");
        student.displayInfo();
        System.out.println();

        student.addNewCourse(course3);
        student.displayInfo();
        System.out.println();
    }
}
