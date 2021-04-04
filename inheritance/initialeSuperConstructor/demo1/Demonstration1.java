
class Box {
    double length;
    double height;
    double width;

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box() { // default setting constructor
        this(0.0, 0.0, 0.0);
    }

    double volume() {
        return (length * height * width);
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // calling parent class constructor
        this.weight = weight;
    }

    BoxWeight() {
        this(0.0, 0.0, 0.0, 0.0);
    }
}

class Demonstation1 {
    public static void main(String[] args) {
        Box b1 = new Box();
        BoxWeight b2 = new BoxWeight(2, 3, 4, 0.7);
        double vol;
        vol = b1.volume();
        System.out.println("Volume of B1 : " + vol);
        vol = b2.volume();
        System.out.println("Volume of B2 : " + vol);
        System.out.println("Weight of B2 : " + b2.weight);
    }
}