package school;

import java.util.ArrayList;

public class School {
    private ArrayList<Classes> classesList = new ArrayList<>();

    public void addClass(Classes newClass) {
        for (Classes c : classesList) {
            if (c.getRoom().equalsIgnoreCase(newClass.getRoom())) {
                System.out.println("[ Room " + newClass.getRoom() + " already exists! ]");
                return;
            }
        }
        classesList.add(newClass);
        System.out.println("[ Class in room " + newClass.getRoom() + " added successfully! ]");
    }

    public void removeClass(String room) {
        for (Classes clss : classesList) {
            if (room.equalsIgnoreCase(clss.getRoom())) {
                classesList.remove(clss);
                System.out.println("[ Room " + room + " removed successfully! ]");
                return;
            }
        }
        System.out.println("[ Room " + room + " not found! ]");
    }

    public void addStudent(String room, Student student) {
        for (Classes clss : classesList) {
            if (room.equalsIgnoreCase(clss.getRoom())) {
                clss.addStudent(student);
                return;
            }
        }
        System.out.println("[ Room " + room + " is not found! ]");
    }

    public void removeStudent(String room, String name) {
        for (Classes clss : classesList) {
            if (room.equalsIgnoreCase(clss.getRoom())) {
                clss.removeStudent(name);
                return;
            }
        }
        System.out.println("[ Room " + room + " is not found! ]");
    }

    public void displayAllClasses() {
        if (classesList.isEmpty()) {
            System.out.println("[ No classes available! ]");
            return;
        }
        for (Classes clss : classesList) {
            clss.displayClassInfo();
        }
    }

    public void searchStudent(String name) {
        for (Classes clss : classesList) {
            if (clss.hasStudent(name)) {
                System.out.println("[ Student " + name + " found in room " + clss.getRoom() + " ]");
                return;
            }
        }
        System.out.println("[ Student " + name + " not found in any room! ]");
    }
}
