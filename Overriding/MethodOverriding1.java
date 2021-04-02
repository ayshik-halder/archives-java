
class point2D {
    int x;
    int y;

    point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("x = " + x + " || y = " + y);
    }
}

class point3D extends point2D {
    int z;

    point3D(int z) {
        this.z = z;
    }

    void display() {
        System.out.println("x = " + x + " || y = " + y + " || z = " + z);
    }
}

class MethodOverriding1 {
    public static void main(String[] args) {
        point2D p1 = new point2D(3.0, -4.0);
        p1.display(); // refers to method in point2D

        point3D p2 = new point3D(0.0);
        p2.display(); // refeers to method in point 3D

        point2D x = (point2D) p2; // cast p2 to an instance of class point2D
        x.display();
    }
}