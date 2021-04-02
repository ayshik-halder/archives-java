class Animal {
    String colour = "white";

    Animal() { // ctor parent
        System.out.println("animal is created!");
    }

    void eat() {
        System.out.println("eating ....");
    }
}

class Dog extends Animal {
    String colour = "black";

    Dog() { 
        super(); //calling parent constructor by default
        System.out.println("dog is created!");
    }

    void printColour() {
        System.out.println("Colour of Dog = " + this.colour); // referencing to current instance of colour
        System.out.println("Colour of Animal = " + super.colour); // referencing to colour instance variable of Animal
    }

    void eat() {
        System.out.println("eating bread....");
    }

    void bark() {
        System.out.println("barking....");
    }

    void work() {
        super.eat(); // referencing to eat() method of Animal
        this.bark();
        this.eat();
    }

}

public class superInvokeConstructor {
    public static void main(String[] args) {
        Dog d = new Dog(); // constuctor super
        d.printColour(); // demo super variable
        d.work(); // demo super method
    }
}
