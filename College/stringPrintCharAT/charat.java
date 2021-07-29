
import java.util.*;

public class charat {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String str;
        System.out.println("Enter String:");
        str = sc.nextLine();
        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.println(str.charAt(i));
        }
    }
}

