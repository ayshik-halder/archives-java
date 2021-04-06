//private
class A {
    private int data = 10;

    public void msg() {
        System.out.println("ClassA: Hello Java");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        A obj = new A();// OK : class A is public
        // System.out.println(obj.data);// CompileTimeError:data is private
        obj.msg();// Ok:msg is public
    }
}
