package ComplexPackage;
import java.util.Scanner;

public class complexOp {
    double img, real;
    Scanner N = new Scanner(System.in);

    public void getData() {
        System.out.print("Enter real :");
        real = N.nextDouble();
        System.out.print("Enter imaginary :");
        img = N.nextDouble();
    }

    public complexOp AddD(complexOp a, complexOp b) {
        complexOp temp = new complexOp();
        temp.real = a.real + b.real;
        temp.img = a.img + b.img;
        return temp;
    }

    public complexOp SubB(complexOp A, complexOp B) {
        complexOp Temp = new complexOp();
        Temp.real = A.real - B.real;
        Temp.img = A.img - B.img;
        return Temp;
    }

    public complexOp ProD(complexOp A, complexOp B) {
        complexOp T = new complexOp();
        T.real = (A.real * B.real) - (A.img * B.img);
        T.img = (A.real * B.img) + (A.img * B.real);
        return T;
    }

    public void displayD() {
        if (img < 0)
            System.out.println("Complex number : " + real + img + "i ");
        else
            System.out.println("Complex number : " + real + "+" + img + "i ");
    }
}
