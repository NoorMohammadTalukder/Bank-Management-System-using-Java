package Class;
import Interface.*;
import java.lang.*;

public class SavingsAccount extends Account
{
    private double interestRate;
	
    public void setInterestRate(double interestRate)
    {
		this.interestRate = interestRate;
    }
    public double getInterestRate()
    {
		return interestRate;
    }
	
    public void showInfo()
    {
        System.out.println("**Savings Account**");
		System.out.println("Account Number: "+getAccountNumber());
		System.out.println("Balance: "+getBalance());
		System.out.println("Interest Rate: "+interestRate+"%");
		System.out.println();
    }
}
