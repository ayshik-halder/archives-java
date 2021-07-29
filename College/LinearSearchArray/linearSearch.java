
import java.util.*;

public class linearSearch {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int i, n, s;
        int f = 0;
        System.out.println("Enter array size");
        n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter elements of array");
        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        s = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (ar[i] == s) {
                System.out.println(s + " found at location " + (i + 1));
                f += 1;
            }

        }
        if (f == 0) {
            System.out.println("Element missing!");
        }
    }
}

