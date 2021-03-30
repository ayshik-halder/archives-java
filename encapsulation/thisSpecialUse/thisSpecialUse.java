package com.encapsulation.thisSpecialUse;


class Circle {
    double x, y;
    double r;

    Circle() {
        this(0.0, 0.0, 1.0);
    }

    Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    Circle(Circle c) {
        this(c.x, c.y, c.r);
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
        this(1.0, 1.0, 1.0);
    }

    Rectangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Rectangle(Rectangle r) {
        this(r.length, r.width, r.height);
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

class thisSpecialUse {
    public static void main(String[] args) {
        Circle c1 = new Circle(0.0, 0.0, 5.0);
        Rectangle r1 = new Rectangle(10.0, 5.0, 2.0);
        Circle c2 = new Circle();
        Rectangle r2 = new Rectangle();
        Circle c3 = new Circle(c1);
        Rectangle r3 = new Rectangle(r1);
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
        System.out.println();
        //non-param Ctor
        System.out.println("Area Circle:" + c2.area());
        System.out.println("Circumference Circle:" + c2.circumference());
        System.out.println("Area Rectangle:" + r2.area());
        System.out.println("Volume Rectangle:" + r2.volume());
        System.out.println();
        //copy ctor
        System.out.println("Area Circle:" + c3.area());
        System.out.println("Circumference Circle:" + c3.circumference());
        System.out.println("Area Rectangle:" + r3.area());
        System.out.println("Volume Rectangle:" + r3.volume());
    }
}

