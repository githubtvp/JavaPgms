import java.util.Scanner;

public class Account {

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        BankAccount bA = new BankAccount(100, 4);   
        pr("St Bal : " + bA.getBal());
        
        pr("Enter your starting bal :");
        double stBal = kb.nextDouble();
        pr("Enter int rate :");
        double intRate = kb.nextDouble();
        bA = new BankAccount(stBal, intRate);
        pr("St Bal : " + bA.getBal());
        pr("Int Rate : " + bA.getIntRate());
        
    }
    
    static void pr(String msg)
    {
        System.out.println(msg);
    }    
}