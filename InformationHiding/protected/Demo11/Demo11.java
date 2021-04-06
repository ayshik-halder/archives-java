class A {
    protected void display() {
        System.out.println("Class A : Hello Java");
    }
}

class Demo11 {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
