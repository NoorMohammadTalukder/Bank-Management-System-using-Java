package Class;
import Interface.*;
import java.lang.*;
//import java.util.Scanner;

public abstract class Account implements ITransactions
{
    private int accountNumber;
    private double balance;
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
    
    public abstract void showInfo();
    
    public void deposit(double amount)
    {
        /*try
        {
            double da;
            Scanner s11 = new Scanner(System.in);
            System.out.print("Enter Deposit Amount: ");
            da = s11.nextDouble();
        }
        catch(Exception ex1)
        {
            System.out.println(ex1);
            System.out.println("Enter Valid Amount");
        }*/
        if(amount>0)
        {
            System.out.println("Money Deposited: "+ amount+ " BDT");
            balance = balance + amount;
            System.out.println("Current Balance: "+ balance + " BDT");
            System.out.println();
        }
        else
        {
            System.out.println("Sorry, Money Deposit Unsuccessful! Please try again.");
        }
    }
    
    public void withdraw(double amount)
    {
        /*try
        {
            double wa;
            Scanner S12 =new Scanner(System.in);
            System.out.print("Enter Withdraw Amount: ");
            wa = S12.nextDouble();
        }
        catch(Exception ex2)
        {
            System.out.println(ex2);
            System.out.println("Enter Valid Amount.");
        }*/
		if(amount>0 && amount<=balance)
		{
            System.out.println("Amount Withdrawn: "+ amount+ " BDT");
            balance -= amount;
            System.out.println("Current Balance: "+ balance + " BDT");
            System.out.println();
		}
		else
		{
            System.out.println("Sorry, Withdraw Unsuccessful! Please try again.");
		}
    }
    
    public void transfer(Account a, double amount)
    {
        /*try
        {
            double ta;
            Scanner S13 = new Scanner(System.in);
            System.out.print("Enter Amount to Tansfer: ");
            ta = S13.nextDouble();
        }
        catch(Exception ex3)
        {
            System.out.println(ex3);
            System.out.println("Enter Valid Amount.");
        }*/
		if(amount>0 && amount<=balance)
		{
            System.out.println("Amount Transferred: "+ amount+ " BDT");
            this.balance -= amount;
            a.balance += amount;
            System.out.println("Current Balance: "+ this.balance+ " BDT");
            System.out.println();
		}
		else
		{
            System.out.println("Money Transfer Unseccessful! Please try again.");
		}
    }
}
