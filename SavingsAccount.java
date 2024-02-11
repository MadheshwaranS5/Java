public class SavingsAccount extends BankAccount{
    
    @Override
    public void displayBalance() {
        // TODO Auto-generated method stub
        super.displayBalance();

        float interest = 7.0f;
        float interest_rate = interest/100;
        
        System.out.println("the interest: "+(balance+interest_rate));
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.displayBalance();
    }
}

class BankAccount{

    int accountNumber = 12345678;
    int balance = 2500;

    public void displayBalance(){
        
        System.out.println("My current blance is "+balance);
    }
}
