
import java.util.Scanner;

public class atm {
    int pin;
    int amount;
    double balance = 120000;
    Scanner sc = new Scanner(System.in);
    void withdraw()
    {
        System.out.println("Enter your account Number");
        int Account = sc.nextInt();
        if(Account == 3273152)
        {
            System.out.println("Enter Amount to be withdrawn");
            amount = sc.nextInt();
            System.out.println("Enter PIN : ");
            pin = sc.nextInt();
            if(pin == 03)
            {
                balance = balance - amount;
                System.out.println(amount + " is withdrawn from the account number " + Account);
                System.out.println("Balance : " + balance);

            }
            else
            {
                System.out.println("Incorrect PIN!!!");
            }
        }
        else
        {
            System.out.println("Incorrect Account Number");
        }
    }
    

    void deposit()
    {
        System.out.println("Enter your account Number");
        int Account = sc.nextInt();
        if(Account == 3273152)
        {
            System.out.println("Enter Amount to be Deposited");
            amount = sc.nextInt();
            System.out.println("Enter PIN : ");
            pin = sc.nextInt();
            if(pin == 03)
            {
                balance = balance + amount;
                System.out.println(amount + " is Deposited into the account number " + Account);
                System.out.println("Balance : " + balance);

            }
            else
            {
                System.out.println("Incorrect PIN!!!");
            }
        }
        else
        {
            System.out.println("Incorrect Account Number");
        }
    }

    void account()
    {
        System.out.println("Enter your account Number");
        int Account = sc.nextInt();
        if(Account == 3273152)
        {
            System.out.println("Enter PIN : ");
            pin = sc.nextInt();
            if(pin == 03)
            {
                System.out.println("User : Sukeerth");
                System.out.println("Account : Savings Account");
                System.out.println("Available Balance : " + balance);

            }
            else
            {
                System.out.println("Incorrect PIN!!!");
            }
        }
        else
        {
            System.out.println("Incorrect Account Number");
        }
    }
  
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        atm a = new atm();
        
        while(true)
        {
            System.out.println("\nWelcome to banking site\n\n\tChoose What to do:\n\n1 - Withdraw\n2 - Deposit\n3 - Account Details\n4 - Exit\n");

            int key = sc.nextInt();
            switch (key) {
                case 1:
                    a.withdraw();
                    break;
                case 2:
                    a.deposit();
                    break;
                case 3:
                    a.account();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        }
    }
}
