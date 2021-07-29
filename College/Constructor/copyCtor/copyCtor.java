
class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    student(student s) {
        this(s.id, s.name);
        System.out.println("Copy Constructor called");
    }

}

public class copyCtor {
    public static void main(String[] args) {
        student s1 = new student(806, "Ayshik");
        System.out.println("Creating new Object");

        student s2 = new student(s1);
        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);

    }

}
