//implementing abstract class without any abstract method

abstract class Base { // no code just empty method declaration
    void run(){
        System.out.println("Base Run()is called");
    } // pure virtual function
}

class Derived extends Base {
    Derived(){
        System.out.println("Derived Constructor is called!");
    }
    void run() {
        super.run();    //calling non abstract function from abstract classt
        System.out.println("Derived  Run() is called");
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
