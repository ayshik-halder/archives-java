//implementing abstracr

abstract class Base { // no code just empty method declaration
    Base(){
        System.out.println("Base Constructor is  called!");
    }
    abstract void run(); // pure virtual function
}

class Derived extends Base {
    Derived(){
        super();
        System.out.println("Derived Constructor is called!");
    }
    void run() {
        System.out.println("Running Derived Safely");
    }
}

class Demo1 {
    public static void main(String[] args) {
        // Uncommenting the following line will cause compiler error as abstract class connot be instanctiated 
        // line tries to create an instance of abstract class
        // Base b1 = new Base();
        // Base b = new Derived(); // dynamic Bind or Up Casting
        Derived b = new Derived();
        b.run();
    }
}
