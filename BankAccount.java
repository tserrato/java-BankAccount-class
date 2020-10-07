public class BankAccount{

    private double balance;
  
  
  
    public BankAccount(){
  
    }
  
 
    public BankAccount(double pBalance){
        this.balance = pBalance;
    }

    public void setBalance(double newBalance){
        this.balance  = newBalance;
    }
    
    public double getBalance(){
        return this.balance;
    }

    public void deposit(double deposit){
        this.balance += deposit;
    }

    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }

    public void calcInterest(double rate){
        double interest = (rate/100) * this.balance;

        this.balance = this.balance + interest;
    }

 
}