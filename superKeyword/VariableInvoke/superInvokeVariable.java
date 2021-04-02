class Animal {
    String colour = "white";
}

class Dog extends Animal {
    String colour = "black";

    void printColour() {
        System.out.println("Colour of Dog = " + this.colour); // referencing to current instance of colour
        System.out.println("Colour of Animal = " + super.colour); // referencing to colour instance variable of Animal
    }
}

public class superInvokeVariable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColour();
    }
}
