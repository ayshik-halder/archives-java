import java.lang.*;

class Compute {
    double i;

    Compute() {
        this.i = 0.0;
    }

    double squareRoot() {
        return Math.sqrt(this.i);
    }
}

class Calculator {
    public static void main(String[] args) {
        Compute a = new Compute();
        a.i = 64;
        System.out.println(" Square Root of " + a.i + " is: " + a.squareRoot());
    }

}
