public class SimpleFactorial {
    static int n;

    public static void main(String[] args) throws Exception {
        long  factorial = 1;
        n = Integer.parseInt(args[0]);
        if ((n == 0) || (n == 1)) {
            System.out.println("\nFactorial of " + n + " is: " + factorial);
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = (long)(factorial*i);
            }
            System.out.println("\nFactorial of " + n + " is: " + factorial);
        }
    }
}
