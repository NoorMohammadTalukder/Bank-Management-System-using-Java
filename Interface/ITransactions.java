package Interface;
import java.lang.*;
import Class.*;

public interface ITransactions 
{
    public abstract void deposit(double amount);
    void withdraw(double amount);
    void transfer(Account a, double amount);
}
