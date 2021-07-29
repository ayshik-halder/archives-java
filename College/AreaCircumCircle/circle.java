
import java.util.*;

public class circle {
   public static Scanner sc = new Scanner(System.in);

   public static void main(String args[]) {
      System.out.print("Enter the radius: ");
      double radius = sc.nextDouble();

      double area = Math.PI * (radius * radius);
      System.out.println("The area of circle is: " + (float) area);

      double circumference = Math.PI * 2 * radius;
      System.out.println("The circumference of the circle is:" + (float) circumference);
   }
}
