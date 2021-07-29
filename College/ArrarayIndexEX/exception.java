
import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int arr[] = new int[3];
            System.out.print("Enter the elements of the Array : ");
            for (int i = 0; i < 5; i++)
                arr[i] = sc.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Thrown : " + e);
            System.out.println("Out of the Block");
        } finally {
            sc.close();
        }
    }
}
