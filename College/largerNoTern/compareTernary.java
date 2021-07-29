
import java.util.*;

public class compareTernary {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int a, b, max;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        max = (a > b) ? a : b;
        System.out.println("The larger no. is " + max + " between " + a + " and " + b);
    }
}
