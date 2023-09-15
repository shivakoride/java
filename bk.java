import java.util.Scanner;

interface Bank
{
    void withdraw();
    void deposit();
    void accountdetails();
}
class ICICI implements Bank
{
    int balance = 10000;
    Scanner sc = new Scanner(System.in);
    ICICI()
    {
        System.out.println("Welcome to icici");
    }
    public void withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                balance = balance - amount;
                System.out.println("The "+amount+" has been withdrawn from your account");
            }
            else
            {
                System.out.println("Insufficient balance!");
            }
           
    }
    public void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("The "+amount+" has been deposited to your account");
    }
    public void accountdetails()
    {
        System.out.println("balance:"+balance);
    }
}
class Axis implements Bank
{
    int balance = 10000;
    Scanner sc = new Scanner(System.in);
    Axis()
    {
        System.out.println("Welcome to axis");
    }
    public void withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                balance = balance - amount;
                System.out.println("The "+amount+" has been withdrawn from your account");
            }
            else
            {
                System.out.println("Insufficient balance!");
            }
           
    }
    public void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("The "+amount+" has been deposited to your account");
    }
    public void accountdetails()
    {
        System.out.println("balance:"+balance);
    }
}

class HDFC implements Bank
{
    Scanner sc = new Scanner(System.in);
    int balance = 10000;
    HDFC()
    {
        System.out.println("Welcome to HDFC");
    }
    public void withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                balance = balance - amount;
                System.out.println("The "+amount+" has been withdrawn from your account");
            }
            else
            {
                System.out.println("Insufficient balance!");
            }
           
    }
    public void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("The "+amount+" has been deposited to your account");
    }
    public void accountdetails()
    {
        System.out.println("balance:"+balance);
    }
}

class SBI implements Bank
{
    Scanner sc = new Scanner(System.in);
    int balance = 10000;
    SBI()
    {
        System.out.println("Welcome to SBI");
    }
    public void withdraw()
    {
        System.out.print("Enter the amount to be withdrawn : ");
            int amount = sc.nextInt();
            if(amount <= balance)
            {
                balance = balance - amount;
                System.out.println("The "+amount+" has been withdrawn from your account");
            }
            else
            {
                System.out.println("Insufficient balance!");
            }
           
    }
    public void deposit()
    {
        System.out.print("Enter the amount to be deposited : ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("The "+amount+" has been deposited to your account");
    }
    public void accountdetails()
    {
        System.out.println("balance : "+balance);
    }
}

public class Atm 
{
    
    public static void main(String[] args)
    {
    int ch,n,amount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your bank : \n1.ICICI\n2.Axis\n3.HDFC\n4.SBI");
    ch = sc.nextInt();
    while(true)
    {
        switch(ch)
        {
            case 1: ICICI i = new ICICI();
                    
                    while(true)
                    {
                        System.out.println("Enter your choice : \n1.withdraw\n2.deposit\n3.accountdetails\n4.Exit");
                    n = sc.nextInt();

                    
                        switch(n)
                        {
                            case 1: i.withdraw();
                                    break;
                            case 2: i.deposit();
                                    break;
                            case 3: i.accountdetails();
                                    break;
                            case 4: System.exit(0); 
                            default:System.out.println("Invalid choice!!");
                        }
                    }
                    
                    
            case 2: Axis a = new Axis();
                    while(true)
                    {
                        System.out.println("Enter your choice : \n1.withdraw\n2.deposit\n3.accountdetails\n4.Exit");
                    n = sc.nextInt();

                    
                        switch(n)
                        {
                            case 1: a.withdraw();
                                    break;
                            case 2: a.deposit();
                                    break;
                            case 3: a.accountdetails();
                                    break;
                            case 4: System.exit(0); 
                            default:System.out.println("Invalid choice!!");
                        }
                    }
                    
                    
            case 3: HDFC h = new HDFC();
                    while(true)
                    {
                        System.out.println("Enter your choice : \n1.withdraw\n2.deposit\n3.accountdetails\n4.Exit");
                    n = sc.nextInt();

                    
                        switch(n)
                        {
                            case 1: h.withdraw();
                                    break;
                            case 2: h.deposit();
                                    break;
                            case 3: h.accountdetails();
                                    break;
                            case 4: System.exit(0); 
                            default:System.out.println("Invalid choice!!");
                        }
                    }
                    
                    
            case 4: SBI s = new SBI();
                    while(true)
                    {
                        System.out.println("Enter your choice : \n1.withdraw\n2.deposit\n3.accountdetails\n4.Exit");
                    n = sc.nextInt();

                    
                        switch(n)
                        {
                            case 1: s.withdraw();
                                    break;
                            case 2: s.deposit();
                                    break;
                            case 3: s.accountdetails();
                                    break;
                            case 4: System.exit(0); 
                            default:System.out.println("Invalid choice!!");
                        }
                    }
                    
                    
            case 5:System.exit(0);
            default:System.out.println("Invalid choice!!");

        }
    }
    }
    
}
