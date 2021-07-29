
import java.util.*;

public class binaryDeci {
    public static Scanner sc = new Scanner(System.in);

    public static int getDecimal(Long binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                Long temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }

    public static void main(String args[]) {
        long a;
        System.out.println("Enter Binary number:");
        a = sc.nextLong();
        System.out.println("Decimal Equivalent: " + getDecimal(a));

    }
}

