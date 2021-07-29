
import java.util.*;
public class countChar {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        System.out.println("Enter String:");
        s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.println("Total number of characters in the string: " + count);
    }

}



