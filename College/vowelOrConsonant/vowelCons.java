
import java.util.*;

public class vowelCons {
   public static Scanner sc = new Scanner(System.in);

   public static void main(String args[]) {
      System.out.println("Enter a character :");

      char ch = sc.next().charAt(0);
      if (ch == ' ')
         System.out.println("Invalid Character");
      else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
         System.out.println("Given character is an vowel");
      } else {
         System.out.println("Given character is a consonant");
      }
   }
}
