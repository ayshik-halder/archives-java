public class StaticMethod {
    public double x, y, r;

    public StaticMethod(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public StaticMethod() {
        this(0.0, 0.0, 0.1);

    }

    public StaticMethod(StaticMethod c) {
        this(c.x, c.y, c.r);

    }

    public StaticMethod(double r) {
        this(0.0, 0.0, r);

    }

    public StaticMethod bigger(StaticMethod c) {
        if (c.r > r) {
            return c;
        } else {
            return this;
        }
    }

    public static StaticMethod bigger(StaticMethod a, StaticMethod b) {
        if (a.r > b.r) {
            return a.r;
        } else {
            return b.r;
        }
    }

    public static void main(String[] args) {
        StaticMethod a= new StaticMethod(2.0);
        StaticMethod b= new StaticMethod(3.0);
        StaticMethod c= a.bigger(b);   //call of instance method
        StaticMethod d= StaticMethod.bigger(a, b); //call of class method
        }
}
