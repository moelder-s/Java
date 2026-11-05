public class SimMain {
    public static void main(String[] args) {
        PrepaidSim sim1 = new PrepaidSim();
        sim1.setPhoneNumber(123456789);
        sim1.setBalance(100.0);
        sim1.topup(50.0);
        sim1.call(10); 

        System.out.println("Remaining balance: " + sim1.getBalance());
        System.out.println("Phone number: " + sim1.getPhoneNumber());
        
    }
}
