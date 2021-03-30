package com.encapsulation.multiClass1;

class Circle {
    double x, y;
    double r;

    Circle() {
        x = 0.0;
        y = 0.0;
        r = 1.0;
    }

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    double circumference() {
        return 2 * (22.0 / 7.0) * r;
    }

    double area() {
        return (22.0 / 7.0) * r * r;
    }
}

class Rectangle {
    double length;
    double width;
    double height;

    Rectangle() {
        length = 1.0;
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double area() {
        double ar;
        ar = (length * width + width * height + height * length);
        return ar;
    }

    double volume() {
        double vol;
        vol = length * width * height;
        return vol;
    }

}

class multiClass1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(0.0, 0.0, 5.0);
        Rectangle r1 = new Rectangle(10.0, 5.0, 2.0);
        Circle c2 = new Circle();
        Rectangle r2 = new Rectangle();
//        c.x = 0.0;
//        c.y = 0.0;
//        c.r = 5.0;
//        r.height = 2.0;
//        r.width = 5.0;
//        r.length = 10.0;
        System.out.println("Area Circle:" + c1.area());
        System.out.println("Circumference Circle:" + c1.circumference());
        System.out.println("Area Rectangle:" + r1.area());
        System.out.println("Volume Rectangle:" + r1.volume());
        //non-param Ctor
        System.out.println("Area Circle:" + c2.area());
        System.out.println("Circumference Circle:" + c2.circumference());
        System.out.println("Area Rectangle:" + r2.area());
        System.out.println("Volume Rectangle:" + r2.volume());
    }
}
