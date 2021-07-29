
class Parent {
    void display() {
        System.out.println("Parent Called");
    }
}

class Child extends Parent {
    void displayC() {
        System.out.println("Child Called");
    }
}

class GrandChild extends Child {
    void displayG() {
        display();
        displayC();
        System.out.println("Grand Child Called");
    }
}

public class multiInheritance {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.displayG();

    }

}


