import ComplexPackage.*;

public class Complex {
    public static void main(String[] args) {
        complexOp c1 = new complexOp();
        System.out.println("Entre first number : ");
        c1.getData();
        c1.displayD();
        complexOp c2 = new complexOp();
        System.out.println("Enter second number : ");
        c2.getData();
        c2.displayD();
        complexOp c3 = new complexOp();
        c3 = c3.AddD(c1, c2);
        System.out.println("Sum is : ");
        c3.displayD();
        complexOp c4 = new complexOp();
        c4 = c4.SubB(c1, c2);
        System.out.println("Sub is : ");
        c4.displayD();
        complexOp c5 = new complexOp();
        c5 = c5.ProD(c1, c2);
        System.out.println("Product is : ");
        c5.displayD();
    }
}

