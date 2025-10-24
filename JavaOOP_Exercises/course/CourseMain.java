package course;

public class CourseMain {
    public static void main(String[] args) {
        System.out.println("""
                COURSE SYSTEM
                =========================================
                """);

        OnlineCourse course = new OnlineCourse("Java Programming", "Mr. Smith", 3, "Udemy", 6);
        course.displayDetails();
    }
}
