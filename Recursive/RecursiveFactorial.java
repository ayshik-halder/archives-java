import java.util.*;

public class RecursiveFactorial {
    public static long factorial(int n) {
        if (n == 0) { // termination condition
            return (1);
        } else {
            return n * factorial(n - 1); // fact = n* (n-1) * (n-2) * (n-3) * ..... * 2 * 1 --- Recursive call
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to compute factorial: ");
        try {
            a = sc.nextInt();
            long fact = factorial(a);
            System.out.println("Factorial of " + a + " is : " + fact);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Only Integers Supported! Start Over!!");
        } finally {
            sc.close();
        }
    }
}