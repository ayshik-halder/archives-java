
import java.util.*;
public class ComplexNo {
    double real, img;

    ComplexNo(double r, double i) {
        this.real = r;
        this.img = i;
    }

    public static ComplexNo sum(ComplexNo c1, ComplexNo c2) {

        ComplexNo temp = new ComplexNo(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;
    }
    public static void main(String args[]) {
        double r, img;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Real and imaginary part of Complex 1");
        r = sc.nextDouble();
        img = sc.nextDouble();
        ComplexNo c1 = new ComplexNo(r, img);
        System.out.println("Enter Real and imaginary part of Complex 2");
        r = sc.nextDouble();
        img = sc.nextDouble();
        ComplexNo c2 = new ComplexNo(r, img);
        ComplexNo temp = sum(c1, c2);
        System.out.printf("Sum is: %.1f + %.1fi ", temp.real, temp.img);
    }
}
