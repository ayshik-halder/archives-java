import java.util.*;

public class TestPrime {

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers to check for Prime: ");
        try {
            a = sc.nextInt();
            if (prime(a)) {
                System.out.printf(a + " is Prime.");
            } else {
                System.out.printf(a + " is not Prime");
            }
        } catch (InputMismatchException e) {
            System.out.println("Only Integers Supported! Start Over!!");
        } finally {
            sc.close();
        }

    }
}
