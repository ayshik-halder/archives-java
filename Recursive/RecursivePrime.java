import java.util.*;

public class RecursivePrime {
    static int i = 2;   //static counter

    public static boolean prime(int n) {
        if (n == 0 || n == 1) {  //special cases for non prime
            return false;
        }
        if (n == i) { //checking prime
            return true;
        }
        if (n % i == 0) {   //base cases
            return false;
        }
        i++;
        return prime(n);
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
