package school;

public class SchoolMain {
    public static void main(String[] args) {
        Teacher rose = new Teacher("Rose", "Mathematics");
        Classes classA = new Classes("A132", rose);
        classA.setTime(8, 30, "AM");

        System.out.println("""
                SCHOOL CLASSES
                =========================================
                """);
        School school = new School();
        school.addClass(classA);

        school.addStudent("A132", new Student("JhymDrenMG"));
        school.addStudent("A132", new Student("Jason D. Ramos"));
        school.addStudent("A132", new Student("Greed C. Kulot"));

        school.displayAllClasses();

        school.removeStudent("A132", "Jason D. Ramos");
        school.displayAllClasses();

        school.searchStudent("Greed C. Kulot");

        Teacher emily = new Teacher("Emily", "Physics");
        classA.changeTeacher(emily);
        school.displayAllClasses();
    }
}
