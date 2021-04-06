//Default Access modifier
class A {
    void msg() {
        System.out.println("Hi! ClassA");
    }
}

class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}
