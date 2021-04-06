//protected
class A {
    protected int data = 10;

    protected void msg() {
        System.out.println("Class A: Hello Java " + this.data);
    }
}

class Demo10 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
        System.out.println("Main Class " + obj.data);
    }
}