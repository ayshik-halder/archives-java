import java.lang.*;

class Calculator{
    int x;

    double power() {
        return Math.sqrt(this.x);
    }
}

class example1 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.x = Integer.parseInt(args[0]);
        double y= a.power();
        System.out.println("Square root of "+ a.x +"is:"+ y);
    }

}
