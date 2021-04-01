import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursiveGCD {
    public static int gcd(int m, int n) {
        if (m > n) { // gcd(10,5) = gcd (5,10)
            return gcd(n, m);
        }
        if (m == n) { // gcd(14,14)=14
            return m;
        }
        if (m == 0) { // gcd(0,11) = 11
            return n;
        }
        if (m == 1) { // gcd(1,5) = 1
            return 1;
        }
        return gcd(m, n % m); // gcd(8,12)= gcd(8.4)= gcd(4,8)= gcd(4,0)= gcd(0,4)= 4
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers to compute gcd: ");
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.printf("GCD of " + a + " and " + b + " is : " + gcd(a, b));
        } catch (InputMismatchException e) {
            System.out.println("Only Integers Supported! Start Over!!");
        } finally {
            sc.close();
        }

    }
}
