
import java.util.*;

public class stringRev {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String s, rev = "";
        System.out.println("Enter the string to reverse");
        s = sc.nextLine();
        int length = s.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + s.charAt(i);
        System.out.println("Reversed string: " + rev);
    }
}
