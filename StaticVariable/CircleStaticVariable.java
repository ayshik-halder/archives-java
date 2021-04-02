public class CircleStaticVariable {
    static int Count = 0; // static variable has only one copy (unlike instance variables)
    public double x, y, r;

    public CircleStaticVariable(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;

    }

    public CircleStaticVariable() {
        this(0.0, 0.0, 0.1);
        Count++;
    }

    public CircleStaticVariable(CircleStaticVariable c) {
        this(c.x, c.y, c.r);
        Count++;
    }

    public CircleStaticVariable(double r) {
        this(0.0, 0.0, r);
        Count++;
    }

    public double circumference() {
        return (2 * 3.14 * r);
    }

    public double radius() {
        return (3.14 * r * r);
    }

    public static void main(String[] args) {
        CircleStaticVariable c1 = new CircleStaticVariable();
        System.out.println(" C" + c1.Count);
        CircleStaticVariable c2 = new CircleStaticVariable(5.0);
        System.out.println(" C" + c2.Count);
        CircleStaticVariable c3 = new CircleStaticVariable(c1);
        System.out.println(" C" + c3.Count);

    }
}
