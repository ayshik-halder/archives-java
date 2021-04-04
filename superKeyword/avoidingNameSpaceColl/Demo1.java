//Avoiding Name Space Collision by implementing super

class A {
    int i;
}

class B extends A {
    int i; // this i hides the i in A

    B(int a, int b) {
        super.i = a;    //referring to i in superclass A
        this.i = b;     //referring to i in subclass B (this- refers to current instance)
    }

    void show() {
        System.out.println("i in superclass : " + super.i);
        System.out.println("i in subclass : " + this.i);

    }
}

public class Demo1 {
    public static void main(String[] args) {
        B subObj = new B(2, 5);
        subObj.show();
    }
}
