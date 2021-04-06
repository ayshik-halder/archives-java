class A {
    private A() {
        // private constructor
    }

    // public A() {
    //     // public constructor
    // }

    void msg() {
        System.out.println("Class A: Hello Java");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        A obj = new A(); // compile Time error: Private ctor doest allow object creation
        obj.msg();
    }
}
