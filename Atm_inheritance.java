import java.util.Scanner;

class card_details{

    static int atm_pin = 1234;
    static int balance = 20000;
    static int option;
    static int amount;

    static Scanner s= new Scanner(System.in);

    public static void details(){
        System.out.println("Please insert your card");

        System.out.print("Enter your 4digit pin: ");
        int enter_pin = s.nextInt();

        if (atm_pin==enter_pin) {
            System.out.println("Enter what action do you want, 1.deposite, 2.withdraw, 3.Balance inqury");
            option = s.nextInt();
        }
        else{
            System.out.println("Enter the correct pin");
        }

    }
}

class Deposite extends card_details{

    public static void deposite(){

        System.out.println("Enter the amount: ");
        amount = s.nextInt();

        System.out.println("Deposited amount: "+amount+" Now your total balance is "+(amount+balance));

    }
}

class Withdraw extends Deposite{

    public static void withdraw(){

        System.out.println("Enter the Amount: ");
        amount = s.nextInt();

        if (balance>=amount) {
            System.out.println("Now debited amount is "+amount+" Your remaining balance is "+(balance - amount));

        }
        else{
            System.out.println("Insufficient Balance");
        }
        
    }
}

class Balance_inqury extends Withdraw{

    public static void balance_inqury(){
        
        System.out.println("Your current Balance is "+balance);
    }
}


public class Atm_inheritance extends Balance_inqury{
    
    public static void main(String[] args) {
        
        details();
        
        if (option==1) {
            deposite();
        }
        
        else if (option==2) {
            withdraw();
        }
        else if (option==3) {
            balance_inqury();
        }
        
    }
}
