import java.util.*;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int Number1, Number2;
            System.out.println("Enter First Number");
            Number1 = sc.nextInt();
            System.out.println("Enter Second Number");
            Number2 = sc.nextInt();
            System.out.println("sum:" + (Number1 + Number2));
        }
         catch(InputMismatchException exception){
            double N1,N2;
            N1 = sc.nextDouble();
            System.out.println("Enter Second Number");
            N2 = sc.nextDouble();
            System.out.println("sum:" + (N1 + N2));
        } 
        finally {
            sc.close();
        }

    }

}
