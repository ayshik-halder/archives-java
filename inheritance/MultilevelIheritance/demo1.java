//multilevel inheritance
class Box {
    private double length;
    private double height;
    private double width;

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
        super();
        this.weight = 0.0;
    }
}

class Shipment extends BoxWeight {
    double cost;

    Shipment(double length, double height, double width, double weight, double cost) {
        super(length, height, weight, weight);
        this.cost = cost;
    }

    Shipment() {
        super();
        this.cost = 0.0;
    }
}

class demo1 {
    public static void main(String[] args) {

        Shipment b1 = new Shipment(1, 4, 4, 3.5, 56);
        double vol;
        vol = b1.volume();
        System.out.println("Volume of B1 : " + vol);
        System.out.println("Weight of B1 : " + b1.weight);
        System.out.println("Cost of B1 : " + b1.cost);

        Shipment b2 = new Shipment(2, 3, 4, 0.7, 60);
        vol = b2.volume();
        System.out.println("Volume of B2 : " + vol);
        System.out.println("Weight of B2 : " + b2.weight);
        System.out.println("Cost of B2 : " + b2.cost);
    }
}