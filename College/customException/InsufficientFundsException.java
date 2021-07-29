
public class InsufficientFundsException extends Exception{
    private double needs;
    public InsufficientFundsException(double needs) {
        this.needs = needs;
    }

    public double getAmount(){
        return needs;
    }
}
