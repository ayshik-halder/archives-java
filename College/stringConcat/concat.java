
import java.util.Scanner;

public class concat {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s1, s2, s3;
        System.out.println("Enter 2 Strings:");
        s1 = sc.nextLine() + " ";
        s2 = sc.nextLine();
        s3 = s1.concat(s2);
        System.out.println("After Concatenation: " + s3);
    }
}
