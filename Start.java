import Class.*;
import Interface.*;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.*;

public class Start
{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        
        int choice = 0;
        while(true)
        {
            try
            {
                System.out.println("***********************************");
                System.out.println("***Welcome to Banking Aplication***");
                System.out.println("***********************************");
                System.out.println("    1. Employee Management");
                System.out.println("    2. Customer Management");
                System.out.println("    3. Customer Account Management");
                System.out.println("    4. Account Transactions");
                System.out.println("    5. Exit");
                System.out.print("Enter An Option: ");
                
                Scanner S = new Scanner(System.in);
                choice = S.nextInt();
                System.out.println();
            }
            catch(Exception E)
            {
                System.out.println(E);
                System.out.println("Please Try Again Using 1,2,3,4 or 5");
            }
            if(choice==1)
            {
                int c = 0;
                while(true)
                {
                    try
                    {
                        System.out.println("1. Insert New Employee");
                        System.out.println("2. Remove Existing employee");
                        System.out.println("3. Show All Employees");
                        System.out.println("4. Exit");
                        System.out.print("Enter An Option: ");
                        
                        Scanner S11 = new Scanner(System.in);
                        c = S11.nextInt();
                        System.out.println();
                    }
                    catch(Exception E1)
                    {
                        System.out.println(E1);
                        System.out.println("Please Try Again Using 1,2,3 or 4");
                        System.out.println();
                    }
                    finally
                    {
                        if(c == 1)
                        {
                            try
                            {
                                Scanner in = new Scanner(System.in);
                                System.out.print("Number Of Employee to Enter at a Time: ");
                                int num = in.nextInt();
                                
                                
                                for(int i=1; i<=num; i++)
                                {
                                    Scanner S11 = new Scanner(System.in);
                                    
                                    System.out.print("Enter Employee ID: ");
                                    String id = S11.next();
                                    System.out.print("Enter Employee Name: ");
                                    String n = S11.next();
                                    System.out.print("Enter Employee Salary: ");
                                    double s = S11.nextDouble();
                                    
                                    Employee e = new Employee();
                                    e.setName(n);
                                    e.setEmpId(id);
                                    e.setSalary(s);
                                    b.insertEmployee(e);
                                }
                            } 
                            catch(Exception E11)
                            {
                                System.out.println(E11);
                                System.out.println("Please Enter a Valid Information");
                                System.out.println();
                            }
                        }
                        else if(c == 2)
                        {
                            try
                            {
                                Scanner S11 = new Scanner(System.in);
                                System.out.print("Enter Employee ID: ");
								String id2 = S11.next();
							
								Employee e1 = b.getEmployee(id2);
							
								if(e1 != null)
								{
                                    b.removeEmployee(e1);
								}
                            }
                            catch(Exception E12)
                            {
                                System.out.println(E12);
                                System.out.println("Please Try again");
                                System.out.println();
                            }
                        }
                        else if(c == 3)
                        {
                            /*try
                            {
                                File readf11 = new File("C:/Users/User/Desktop/AIUB Sem 06/Java/Fahmida Mam/Project/Project Code/Employee.txt");
                                Scanner read = new Scanner(readf11);
                            
                                while(read.hasNext())
                                {
                                    n = read.nextLine();
                                    System.out.println(n);
                                }
                                read.close();
                            }
                            catch(Exception E13)
                            {
                                System.out.println(E13);
                                System.out.println("Please Try again");
                            }*/
                            
                            b.showAllEmployees();
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong Input! Please Try again.");
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice==2)
            {
                int c = 0;
                while(true)
                {
                    try
                    {
                        System.out.println("1. Insert New Customer(s)");
                        System.out.println("2. Remove Existing Customer(s)");
                        System.out.println("3. Show All Customer");
                        System.out.println("4. Exit");
                        System.out.print("Enter An Option: ");
                        
                        Scanner S2 = new Scanner(System.in);
                        c = S2.nextInt();
                        System.out.println();
                    }
                    catch(Exception E2)
                    {
                        System.out.println(E2);
                        System.out.println("Please Try Again Using 1,2,3 or 4");
                        System.out.println();
                    }
                    finally
                    {
                        if(c == 1)
                        {
                            try
                            {
                                Scanner in2 = new Scanner(System.in);
                                System.out.print("Number Of Customer To Enter At a Time: ");
                                int num2 = in2.nextInt();
                                
                                for(int i=1; i<=num2; i++)
                                {
                                    Scanner S21 = new Scanner(System.in);
                                    
                                    System.out.print("Enter Customer ID: ");
                                    int id = S21.nextInt();
                                    System.out.print("Enter Customer Name: ");
                                    String n = S21.next();
                                    
                                    Customer cu = new Customer();
                                    cu.setName(n);
                                    cu.setNid(id);
                                    
                                    b.insertCustomer(cu);
                                    
                                    //f21.format("Name: %s ; ID: %d \r\n", n, id);
                                }
                                //f21.close();   
                            } 
                            catch(Exception E21)
                            {
                                System.out.println(E21);
                                System.out.println("Please Enter a Valid Information");
                                System.out.println();
                            }
                        }
                        else if(c ==2)
                        {
                            try
                            {
                                Scanner S22 = new Scanner(System.in);
                                System.out.print("Enter Customer ID: ");
								int id2 = S22.nextInt();
							
								Customer cu2 = b.getCustomer(id2);
							
								if(cu2 != null)
								{
                                    b.removeCustomer(cu2);
								}
                            }
                            catch(Exception E12)
                            {
                                System.out.println(E12);
                                System.out.println("Please Try again");
                                System.out.println();
                            }
                        }
                        else if(c==3)
                        {
                            b.showAllCustomers();
                        }
                        else if(c ==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Wrong Input! Please Try Again.");
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice==3)
            {
                int c = 0;
                while(true)
                {
                    try
                    {
                        System.out.println("1. Insert New Account(s)");
                        System.out.println("2. Remove Existing Account(s)");
                        System.out.println("3. Show All Accounts");
                        System.out.println("4. Exit");
                        System.out.print("Enter An Option: ");
                        
                        Scanner S3 = new Scanner(System.in);
                        c = S3.nextInt();
                        System.out.println();
                    }
                    catch(Exception E3)
                    {
                        System.out.println(E3);
                        System.out.println("Please Try Again Using 1,2,3 or 4");
                    }
                    finally
                    {
                        if(c==1)
                        {
                            int co = 0;
                            Account a = null;
                            
                            try
                            {
                                System.out.println("**Type of Account**");
                                System.out.println("1. Savings Account");
                                System.out.println("2. Fixed Account");
                                System.out.println("3. Exit");
                                System.out.print("Enter an Option: ");
                                Scanner S31 = new Scanner(System.in);
                                co = S31.nextInt();
                                System.out.println();
                            }
                            catch(Exception E31)
                            {
                                System.out.println(E31);
                                System.out.println("Invalid Input!! Please Enter a Valid Option.");
                                System.out.println();
                            }
                            finally
                            {
                                if(co==1)
                                {
                                    try
                                    {
                                        SavingsAccount sa = new SavingsAccount();
                                    
                                        Scanner S311 = new Scanner(System.in);
                                    
                                        System.out.print("Enter Account Number: ");
                                        int n = S311.nextInt();
                                        System.out.print("Enter Account Balance: ");
                                        double bal = S311.nextDouble();
                                        System.out.print("Enter Interest Rate: ");
                                        double in = S311.nextDouble();
								
                                        sa.setAccountNumber(n);
                                        sa.setBalance(bal);
                                        sa.setInterestRate(in);
								
                                        a = sa;
                                    }
                                    catch(Exception E311)
                                    {
                                        System.out.println(E311);
                                        System.out.println("Please Enter Valid Information.");
                                        System.out.println();
                                    }
                                }
                                else if(co==2)
                                {
                                    try
                                    {
                                        FixedAccount fa = new FixedAccount();
                                    
                                        Scanner S312 = new Scanner(System.in);
								
                                        System.out.print("Enter Account Number: ");
                                        int n = S312.nextInt();
                                        System.out.print("Enter Account Balance: ");
                                        double bal2 = S312.nextDouble();
                                        System.out.print("Enter Tenure Year: ");
                                        int ty = S312.nextInt();
								
                                        fa.setAccountNumber(n);
                                        fa.setBalance(bal2);
                                        fa.setTenureYear(ty);
								
                                        a = fa;
                                    }
                                    catch(Exception E312)
                                    {
                                        System.out.println(E312);
                                        System.out.println("Please Enter Valid Information.");
                                        System.out.println();
                                    }
                                }
                                else if(co==3)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("Invalid Input!! Please Enter a Valid Option.");
                                    System.out.println();
                                }
                                
                                if(a!= null)
								{
                                    try
                                    {
                                        Scanner S313 = new Scanner(System.in);
                                        System.out.print("Enter Customer NID: ");
                                        int nid1 = S313.nextInt();
                                        b.getCustomer(nid1).insertAccount(a);
                                    }
                                    catch(Exception E313)
                                    {
                                        System.out.println(E313);
                                        System.out.println("Enter a Valid NID.");
                                    }
								}
                            }
                        }
                        else if(c==2)
                        {
                            try
                            {
                                Scanner S32 = new Scanner(System.in);
                                
                                System.out.print("Enter Customer NID: ");
                                int id = S32.nextInt();
                                System.out.print("Enter Account Number: ");
                                int acn = S32.nextInt();
							
                                b.getCustomer(id).removeAccount(b.getCustomer(id).getAccount(acn));
                            }
                            catch(Exception E32)
                            {
                                System.out.println(E32);
                                System.out.println("Please Enter Valid Information.");
                                System.out.println();
                            }
                        }
                        else if(c==3)
                        {
                            try
                            {
                                Scanner S33 = new Scanner(System.in);
                                
                                System.out.print("Enter Customer NID: ");
								int id = S33.nextInt();
							
								b.getCustomer(id).showAllAccounts();
                            }
                            catch(Exception E33)
                            {
                                System.out.println(E33);
                                System.out.println("Please Enter Valid NID.");
                                System.out.println();
                            }
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Input!! Please Enter a Valid Option");
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice==4)
            {
                int c =0;
                while(true)
                {
                    try
                    {
                        System.out.println("1. Deposit Money");
                        System.out.println("2. Withdraw Money");
                        System.out.println("3. Transfer Money");
                        System.out.println("4. Exit");
                        System.out.print("Enter An Option: ");
                        
                        Scanner S4 = new Scanner(System.in);
                        c = S4.nextInt();
                        System.out.println();
                    }
                    catch(Exception E4)
                    {
                        System.out.println(E4);
                        System.out.println("Please Try Again Using 1,2,3 or 4");
                        System.out.println();
                    }
                    finally
                    {
                        if (c==1)
                        {
                            try
                            {
                                Formatter f11 = new Formatter("Transactions.txt");
                                Scanner S41 = new Scanner(System.in);
                            
                                System.out.print("Enter Customer NID: ");
                                int id = S41.nextInt();
                                System.out.print("Enter Account Number: ");
                                int acn = S41.nextInt();
                                System.out.print("Enter Deposit Amount: ");
                                double amount = S41.nextDouble();
							
                                if(amount>0)
                                {
                                    b.getCustomer(id).getAccount(acn).deposit(amount);
                                    f11.format(amount+" BDT has been Deposited in Account Number "+ acn);
                                    System.out.println();
                                }
                                f11.close();
                            }
                            catch(Exception E41)
                            {
                                System.out.println(E41);
                                System.out.println("Invalid Information!! Please Enter Valid Information(s)");
                                System.out.println();
                            }
                        }
                        else if(c==2)
                        {
                            try
                            {
                                Formatter f11 = new Formatter("Transactions.txt");
                                Scanner S42 = new Scanner(System.in);
                                
                                System.out.print("Enter Customer NID: ");
                                int id = S42.nextInt();
                                System.out.print("Enter Account Number: ");
                                int acn = S42.nextInt();
                                System.out.print("Enter Withdraw Amount: ");
                                double amount = S42.nextDouble();
							
                                if(amount>0 && amount<=b.getCustomer(id).getAccount(acn).getBalance())
                                {
                                    b.getCustomer(id).getAccount(acn).withdraw(amount);
                                    f11.format(amount+" BDT has been Withdrawn from Account Number "+acn);
                                }
                                f11.close();
                            }
                            catch(Exception E42)
                            {
                                System.out.println(E42);
                                System.out.println("Please Enter Valid Information!!");
                                System.out.println();
                            }
                        }
                        else if(c==3)
                        {
                            try
                            {
                                Formatter f11 = new Formatter("Transactions.txt");
                                
                                Scanner S43 = new Scanner(System.in);
                                
                                System.out.println("**Enter Information of Customer to Transfer the Money From**");
                                System.out.print("Customer NID: ");
								int id1 = S43.nextInt();
								System.out.print("Account Number: ");
								int acn1 = S43.nextInt();
								System.out.print("Transfer Amount: ");
								double amount1 = S43.nextDouble();
                                
                                System.out.println();
                                
                                System.out.println("**Enter Information of Customer to Transfer the Money**");
							
								System.out.print("Customer NID: ");
								int id2 = S43.nextInt();
								System.out.print("Account Number: ");
								int acn2 = S43.nextInt();
							
								if(amount1>0 && amount1<=b.getCustomer(id1).getAccount(acn1).getBalance())
								{
                                    b.getCustomer(id1).getAccount(acn1).transfer(b.getCustomer(id2).getAccount(acn2),amount1);
                                    f11.format(amount1+" BDT has been transferred from Account No "+acn1+" to Account No "+acn2);
								}
                                f11.close();
                            }
                            catch(Exception E43)
                            {
                                System.out.println(E43);
                                System.out.println("Please Enter Valid Information.");
                                System.out.println();
                            }
                        }
                        else if(c==4)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Inpput!! Please Enter a Valid Option.");
                            System.out.println();
                        }
                    }
                }
            }
            else if(choice==5)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Input!! Please Enter a Valid Input.");
                System.out.println();
            }
        }
    }
}
