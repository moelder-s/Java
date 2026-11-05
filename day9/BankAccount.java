abstract public class BankAccount {

    private int balance;
    
    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void withdraw(int amount){
        if(balance >= amount){
            balance = balance - amount;
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    abstract void displayBalance();
}
