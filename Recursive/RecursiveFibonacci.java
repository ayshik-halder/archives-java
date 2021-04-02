import java.util.*;

public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to compute nth Fibonacci number: ");
        try {
            a = sc.nextInt();
            System.out.println("Fibonacci sequence is:");
            for (int i = 0; i <= a; i++) {
                System.out.println(fibonacci(i));
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Only Integers Supported! Start Over!!");
        } finally {
            sc.close();
        }
    }

}
