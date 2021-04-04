//code reusability using super
//runtime polymorphism 
class Cat {
    void speak() {
        System.out.println("--Meow--");
        System.out.println();
    }
}

class PetCat extends Cat {
    void speak() {
        System.out.println("--Meow <3--");
        System.out.println();
    }
}

class MagicCat extends Cat {
    boolean signal;

    void speak() {
        if (this.signal) {
            super.speak();
        } else {
            System.out.println(" Meow Hooman !!");
        }
    }
}

class Demo1 {
    public static void main(String[] args) {
        PetCat c1 = new PetCat();
        MagicCat c2 = new MagicCat();

        c2.signal = true;
        c2.speak();
        c1.speak();

        c2.signal = false;
        c2.speak();
    }
}
