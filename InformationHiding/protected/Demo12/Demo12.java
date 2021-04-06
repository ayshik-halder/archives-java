//class hierarchy
class A {
    int i; // public by default
    protected int j; //protected will work
    // private int j; // private to a

    void setij(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

// A's private j is not accessible here
class B extends A {
    int total;

    void sum() {
        total = i + j; // error since j is not accesible here
    }
}

public class Demo12 {
    public static void main(String[] args) {
        B subObj = new B();
        subObj.setij(5, 10);
        subObj.sum();
        System.out.println("Total = " + subObj.total);
    }
}
