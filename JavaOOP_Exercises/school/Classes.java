package school;

import java.util.ArrayList;

public class Classes {
    private String room;
    private int hour, minutes;
    private String am_pm;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Classes(String room, Teacher teacher) {
        this.room = room;
        this.teacher = teacher;
    }

    public void setTime(int hour, int minutes, String am_pm) {
        this.hour = hour;
        this.minutes = minutes;
        this.am_pm = am_pm;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("[ Student " + student.getName() + " is successfully added to " + room + "! ]");
    }

    public void removeStudent(String name) {
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.getName())) {
                students.remove(student);
                System.out.println("[ Student " + name + " is successfully removed! ]");
                return;
            }
        }
        System.out.println("[ Student " + name + " not found in " + room + "! ]");
    }

    public void displayAllStudents() {
        System.out.println("Students in " + room + ":");
        if (students.isEmpty()) {
            System.out.println("\t[ No students enrolled yet! ]");
            return;
        }
        for (Student std : students) {
            System.out.println("\t- " + std.getName());
        }
    }

    public void changeTeacher(Teacher newTeacher) {
        this.teacher = newTeacher;
        System.out.println("[ Teacher for room " + room + " is now " + newTeacher.getName() + "! ]");
    }

    public boolean hasStudent(String name) {
        for (Student std : students) {
            if (std.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public String getRoom() {
        return room;
    }

    public String getTime() {
        if (am_pm == null) return "[ Time not set yet ]";
        return hour + ":" + String.format("%02d", minutes) + " " + am_pm;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void displayClassInfo() {
        System.out.println("───────────────────────────────");
        System.out.println("[ Room: " + room + " ]");
        System.out.println("Teacher: " + teacher.getName() + " (" + teacher.getSubject() + ")");
        System.out.println("Time: " + getTime());
        displayAllStudents();
        System.out.println("───────────────────────────────");
    }
}
