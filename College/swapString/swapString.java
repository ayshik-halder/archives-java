
import java.util.*;

public class swapString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1, str2, temp;
        System.out.println("Enter String 1:");
        str1 = sc.nextLine();
        System.out.println("Enter String 2:");
        str2 = sc.nextLine();
        System.out.println("\n\n!!Before Swap!!");
        System.out.println("String 1 = " + str1 + "\n String 2 = " + str2);
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("\n\n!!After Swap!!");
        System.out.println("String 1 = " + str1 + "\n String 2 = " + str2);

    }

}
