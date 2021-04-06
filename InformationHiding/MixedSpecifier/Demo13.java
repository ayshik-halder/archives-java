//private,protected,public

class Base {
    public int x = 10;
    private int y = 10;
    protected int z = 10;
    int a = 10; // implicit Default accessModifier

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return this.y;
    }

    private void setY(int y) {
        this.y = y;
    }

    protected int getz() {
        return this.z;
    }

    protected void setZ(int z) {
        this.z = z;
    }

    int getA() {
        return this.a;
    }

    void setA(int a) {
        this.a = a;
    }
}

public class Demo13 extends Base {
    public static void main(String[] args) {
        Base rr = new Base();
        rr.z = 0;
        Demo13 subObj = new Demo13();

        // Access Modifiers- public
        System.out.println("Value of x is : " + subObj.x);
        subObj.setX(20);
        System.out.println("Value of x is : " + subObj.x);

        // Access Modifiers- public
        // If we remove the comments it would result in a compilation error as the
        // fields and methods being accessed are private

        // System.out.println("Value of y is : " + subObj.y);
        // subObj.setY(20);
        // System.out.println("Value of y is : " + subObj.y);

        //Access Modifiers - Protected
        System.out.println("Value of z is : " + subObj.z);
        subObj.setZ(30);
        System.out.println("Value of z is : " + subObj.z);

        //Access Modifiers - Default
        System.out.println("Value of a is : " + subObj.a);
        subObj.setA(30);
        System.out.println("Value of a is : " + subObj.a);


    }

}
