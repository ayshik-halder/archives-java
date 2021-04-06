
class A {
    public int data = 10;

    public void msg() {
        System.out.println("ClassA : Hello Java");
    }
}

class Demo5 {
    public static void main(String[] args) {
        A obj = new A(); // OK : class A is public
        System.out.println(obj.data); // Ok:data is public
        obj.msg(); // Ok:msg is public
    }
}
