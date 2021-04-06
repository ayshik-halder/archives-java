//private
class A {
    private int data = 10;

    public void msg() {
        System.out.println("ClassA: Hello Java " + data);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        // private int data2=100;
        // public int data2=100;
        int data2 = 100;
        A obj = new A();// OK : class A is public
        System.out.println("ClassB:" + data2);// Ok:private data in same class
        obj.msg();// Ok:private data is accessible through public method
    }
}
