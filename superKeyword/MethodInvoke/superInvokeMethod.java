class Animal {
    String colour = "white";

    void eat() {
        System.out.println("eating ....");
    }
}

class Dog extends Animal {
    String colour = "black";

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
        super.eat();       //referencing to eat() method of Animal
        this.bark();
        this.eat();
    }

}

public class superInvokeMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
