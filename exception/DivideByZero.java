public class DivideByZero {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Exception encountered : / by zero");;
        }
        // System.out.println(10 / 0);
        System.out.println("ab");
            


    }
}
