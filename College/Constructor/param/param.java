
class student {
    int id;
    String name;

    student(int id, String name) {
        System.out.println("Parameterised Contructor Called!");
        this.id = id;
        this.name = name;
    }

}

public class param {
    public static void main(String[] args) {
        student s1 = new student(806, "Ayshik");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }

}
