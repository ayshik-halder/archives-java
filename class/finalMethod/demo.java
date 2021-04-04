//An abstract class with final method
abstract class Base {
    final void run() {
        System.out.println("Base final run() is running");
    }
}

class Derived extends Base {
}

class demo {
    public static void main(String[] args) {
        Base b = new Derived(); //upcasting
        b.run();
    }
}
