public class CircleStaticVariable {
    static int Count = 0; // static variable
    public double x, y, r;

    public CircleStaticVariable(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        Count++;
    }

    public CircleStaticVariable() {
        this(0.0, 0.0, 0.1);

    }

    public CircleStaticVariable(CircleStaticVariable c) {
        this(c.x, c.y, c.r);

    }

    public CircleStaticVariable(double r) {
        this(0.0, 0.0, r);

    }

    public double circumference() {
        return (2 * 3.14 * r);
    }

    public double radius() {
        return (3.14 * r * r);
    }

    public static void main(String[] args) {
        CircleStaticVariable c1 = new CircleStaticVariable();
        CircleStaticVariable c2 = new CircleStaticVariable(5.0);
        CircleStaticVariable c3 = new CircleStaticVariable(c1);
        System.out.println(" C" + c1.Count + " C" + c2.Count + " C" + c3.Count);

    }
}
