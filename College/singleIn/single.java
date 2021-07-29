
import java.util.*;

class A {
  public void methodA() {
    System.out.println("Base class method");
  }
}

class B extends A {
  public void methodB() {
    System.out.println("Child class method");

  }
}

public class single {

  public static void main(String[] args) {
    B obj = new B();
    obj.methodA();
    obj.methodB();
  }
}
