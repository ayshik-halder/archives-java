
import java.util.*;

interface shape {
   double calc(double x, double y);
}

class rect implements shape {
   public double calc(double x, double y) {
      return (x * y);
   }
}

public class Rectangle {
   public static Scanner sc = new Scanner(System.in);

   public static void main(String arg[]) {
      rect r1 = new rect();
      double l, b;
      System.out.println("Enter Length and Breadth of Rectangle");
      l = sc.nextDouble();
      b = sc.nextDouble();
      System.out.println("\nArea of Rectangle is : " + r1.calc(l, b));

   }
}

