public class PrepaidSim {
    
    private int phoneNumber;
    private double balance;

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    
    
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public double getBalance(){
        return balance;
    }

    //Topup method 
    public void topup(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }

    //Call method
    public void call(int minutes){
        double cost = minutes * 2.50;
        if(balance >= cost){
            balance = balance - cost;    
        }
    }
}