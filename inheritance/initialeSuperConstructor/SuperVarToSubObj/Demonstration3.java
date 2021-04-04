//A superclass variable referring to a subclass object
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

class Demonstation3 {
    public static void main(String[] args) {

        BoxWeight wBox = new BoxWeight(2, 3, 4, 0.7);
        Box box = new Box();
        double vol;
        vol = wBox.volume();
        System.out.println("Volume of WeightBox : " + vol);
        System.out.println("Weight of WeightBox : " + wBox.weight);

        // assign BoxWeight reference to Box reference.(referencing subclass with a superclass)
        box = wBox;
        vol = box.volume();
        System.out.println("Volume of Normal Box : " + vol);
        // The following statement is invalid because plainbox does not define a weight
        // member.
        // System.out.println("Weight of NormalBox : " + box.weight);

    }
}