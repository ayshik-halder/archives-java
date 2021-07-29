import java.util.*;

public class MaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter 2 no.:\n");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.printf("\n Between %d and %d , greater is %d" , a, b, a);
            } else {
                System.out.printf("\n Between %d and %d , greater is %d" , a, b, b);
            }
        } finally {
            sc.close();
        }
    }
}
