package Class;
import Interface.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Formatter;

public class Bank implements CustomerOperations, EmployeeOperations
{
    private Customer customers[] = new Customer [20];
    private Employee employees[] = new Employee [10];
	
    public void insertCustomer(Customer c)
    {
        int check = 0;
		for(int i=0; i<customers.length; i++)
		{
            if(customers[i] == null)
            {
				customers[i] = c;
				check = 1;
				break;
            }
        }
        if(check == 1)
        {
            System.out.println("Customer(s) Inserted.");
            System.out.println();
        }
        else
        {
            System.out.println("Customer Insertion Unseccessful! Please Try Again.");
            System.out.println();
        }
    }
    
    public void removeCustomer(Customer c)
    {
		int check = 0;
		for(int i=0; i<customers.length; i++)
		{
            if(customers[i] == c)
            {
				customers[i] = null;
				check = 1;
				break;
            }
		}
		if(check == 1)
        {
            System.out.println("Customer(s) Removed");
            System.out.println();
        }
		else
        {
            System.out.println("Customer Removal Unsuccessful! Please Try Again.");
            System.out.println();
        }
    }
    
    public Customer getCustomer(int nid)
    {
		Customer c = null;
		for(int i=0; i<customers.length; i++)
		{
            if(customers[i] != null)
            {
				if(customers[i].getNid() == nid)
				{
                    c = customers[i];
                    break;
				}
            }
		}
		if(c != null)
		{
            System.out.println("Customer Found");
            //System.out.println();
		}
		else
		{
            System.out.println("Customer Does Not Exist");
            System.out.println();
		}
		return c;
    }
    
    public void showAllCustomers()
    {
		for(Customer c : customers)
		{
            if(c != null)
            {   
				System.out.println("Customer Name: "+ c.getName());
				System.out.println("Customer NID: "+ c.getNid());
                System.out.println();
                
				c.showAllAccounts();
            }
		}
    }
    
	
    
    public void insertEmployee(Employee e)
    {
        int check = 0;
		for(int i=0; i<employees.length; i++)
		{
            if(employees[i] == null)
            {
				employees[i] = e;
				check = 1;
				break;
            }
		}
		if(check == 1)
		{
            System.out.println("Employee(s) Inserted.");
            System.out.println();
		}
		else
		{
            System.out.println("Employee Insertion Unseccessful!! Please Try Again.");
            System.out.println();
		}
    }
	
    public void removeEmployee(Employee e)
    {
		int check = 0;
		for(int i=0; i<employees.length; i++)
		{
            if(employees[i] == e)
            {
				employees[i] = null;
				check = 1;
				break;
            }
		}
		if(check == 1)
        {
            System.out.println("Employee(s) Removed.");
            System.out.println();
        }
		else
        {
            System.out.println("Removal Unseccessful!! Please Try Again.");
            System.out.println();
        }
    }

    public Employee getEmployee(String empId)
    {
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
            if(employees[i] != null)
            {
				if(employees[i].getEmpId().equals(empId))
				{
                    e = employees[i];
                    break;
				}
            }
		}
		if(e != null)
		{
            System.out.println("Employee Found.");
		}
		else
		{
            System.out.println("Employee Does Not Exist.");
            System.out.println();
		}
		return e;
    }
    
    public void showAllEmployees()
    {
        for(Employee e : employees)
        {
            if(e != null)
            {
                System.out.println("Employee Name: "+ e.getName());
                System.out.println("Employee ID: "+ e.getEmpId());
                System.out.println("Salary: "+ e.getSalary());
                System.out.println();
            }
            /*else
            {
                System.out.println("No Employees to Show.");
                System.out.println();
            }*/
        }
    }
}
