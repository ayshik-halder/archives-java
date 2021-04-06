//An abstract class with final method
abstract class Base {
    final void run() {
        System.out.println("Base final run() is running");
    }
}

class Derived extends Base {
    Derived(){
        System.out.println("Derived constructor called");
    }
    //cant overide
    // void run(){
    //     System.out.println("Derived run() is running");
    // }
}

class demo {
    public static void main(String[] args) {
        Base b = new Derived(); //upcasting
        b.run();
    }
}
