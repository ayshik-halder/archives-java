
class point2D {
    double x;
    double y;

    point2D(double x, double y) {  //invokes if super(x,y) is called
        this.x = x;
        this.y = y;
    }

    point2D() {    //invokes if super() is called
        this(0, 0);
    }

    void display() {
        System.out.println("x = " + x + " || y = " + y);
    }
}

class point3D extends point2D {
    double z;

    point3D(double x, double y, double z) {
        super(x, y);// to overload matching constructor in parent
        this.z = z;
    }

    point3D() {
        super(); // to overload matching constructor in parent
        this.z = 0.0;
    }

    void display() {
        System.out.println("x = " + x + " || y = " + y + " || z = " + z);
    }
}

class TestSuper1 {
    public static void main(String[] args) {
        point2D p1 = new point2D(3.0, -4.0);
        p1.display(); // refers to method in point2D

        point3D p2 = new point3D(2.0, 3.0, 4.0);
        p2.display(); // refeers to method in point 3D

    }
}