
class ChkAcc{
    private double bal;
    private int num;
    public ChkAcc(int num){
        this.num = num;
    }
    public void deposit(double amt){
        bal += amt;
    }
    public void withdraw(double amt) throws InsufficientFundsException{
        if(amt <= bal)
            bal -= amt;
        else{
            double needs = amt - bal;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalence(){
        return bal;
    }
    public int getNumber(){
        return num;
    }
}
public class customException {
    public static void main(String[] args) {
        ChkAcc C1 = new ChkAcc(101);
        System.out.println("Depositing Rs. 10000-----");
        C1.deposit(10000.00);

        try{
            System.out.println("\nWithdrawing Rs. 4000-----");
            C1.withdraw(4000.00);
            System.out.println("\nWithdrawing Rs. 8000-----");
            C1.withdraw(8000.00);
        }catch(InsufficientFundsException e){
            System.out.println("Insufficient Balance to make Withdrawal" + e.getAmount());
            e.printStackTrace();
        }
    }
}

