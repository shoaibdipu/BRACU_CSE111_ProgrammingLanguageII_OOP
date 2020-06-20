public class CheckingAccount extends Account{
    
    public double balance;
    public static int numberOfAccount = 0;
    
    public CheckingAccount(){
        super(0.0);
        numberOfAccount++;
    }
    public CheckingAccount(double b){
        super(0.0);
        balance = b;
        numberOfAccount++;
    }
    public double getBalance(){
        return balance;
    }

}
