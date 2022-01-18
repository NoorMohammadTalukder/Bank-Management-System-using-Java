package Class;
import Interface.*;
import java.lang.*;
import java.util.Scanner;

public class Customer implements AccountOperations
{
    private String name;
    private int nid;
    private Account accounts[] = new Account[5];

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void setNid(int nid)
    {
        this.nid = nid;
    }
    
    public int getNid()
    {
        return nid;
    }
    
    public void insertAccount(Account a)
    {
        int choice = 0;
            try
            {
                System.out.println("    1. Confirm to Create New Account");
                System.out.println("    2. Break");
                System.out.print("Enter An Option: ");
                Scanner S21 = new Scanner(System.in);
                choice = S21.nextInt();
            }
            catch(Exception ex1)
            {
                System.out.println(ex1);
                System.out.println("Please Enter a Valid Option: ");
            }
            switch(choice)
            {
                case 1:
                        int check = 0;
                        for(int i=0; i<accounts.length; i++)
                        {
                            if(accounts[i] == null)
                            {
                                accounts[i] = a;
                                check = 1;
                                break;
                            }
                        }
                        if(check == 1)
                        {
                            System.out.println("Account Inserted");
                            System.out.println();
                        }
                        else
                        {
                            System.out.println("Account Insertion Unseccessful! Please try again.");
                            System.out.println();
                        }
                        break;
                
                case 2:
                         break;
                         
                case 3:
                        System.out.println("Invalid Input!! Please Enter a Valid Option.");
            }
    }
    
    public void removeAccount(Account a)
    {
        int check = 0;
        for(int i=0; i<accounts.length; i++)
		{
            if(accounts[i] == a)
            {
				accounts[i] = null;
				check = 1;
				break;
            }
		}
		if(check == 1)
        {
            System.out.println("Account Removed");
        }
		else
        {
            System.out.println("Account Removal Unseccessful! Please try again");
        }
    }
    
	
    public Account getAccount(int accountNumber)
    {
        Account a = null;
		for(int i=0; i<accounts.length; i++)
        {
            if(accounts[i] != null)
            {
				if(accounts[i].getAccountNumber() == accountNumber)
				{
                    a = accounts[i];
                    break;
				}
            }
		}
		if(a != null)
        {
            System.out.println("Account Found");
        }
		else
		{
            System.out.println("Account does not Exist. Please try again.");
        }
		return a;
    }
    
    public void showAllAccounts()
    {
        for(Account a : accounts)
		{
            if(a != null)
            {
				a.showInfo();
            }
		}
    }
}
