
class Parent {
    void methodA() {
        System.out.println("Base class method");
    }
}
class ChildA extends Parent {
    void displayA() {
        System.out.println("Child class A Called");

    }
}
class ChildB extends Parent {
    void displayB() {
        System.out.println("Child class B Called");

    }
}
public class hierarchialInheritance {
    public static void main(String[] args) {
        System.out.println("Calling Child A ");
        ChildA A = new ChildA();
        A.methodA();
        A.displayA();
        System.out.println("Calling Child B ");
        ChildB B = new ChildB();
        B.methodA();
        B.displayB();
    }
}

