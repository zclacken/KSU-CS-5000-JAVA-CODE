import java.text.NumberFormat;
import java.util.Date;

public class Account
{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    //Constructor with ID and initial balance
    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    //Get method for variables id, balance, and annualInterestRate
    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    //Set method for variables id, balance, and annualInterestRate
    public void setId(int id)
    {
        this.id = id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate/100;
    }

    //Method for variable dateCreated
    public Date getDateCreated()
    {
        return dateCreated;
    }

    //Method that returns the monthly interest rate as double value
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    //Method that returns the earned monthly interest amount as double value
    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate() ;
    }

    //Method that withdraws a specific amount from the account
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    //Method that deposits a specific amount
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    //Create method toString()
    public String toString()
    {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat fmt = NumberFormat.getPercentInstance();
        fmt.setMaximumFractionDigits(1);

        return "Account ID: " + "\t\t\t" + id + "\n" +
                "Account Balance: " + "\t\t" + money.format(balance) + "\n" +
                "Annual Interest Rate: " + "\t" + fmt.format((annualInterestRate)) + "\n" +
                "Monthly Interest: " + "\t\t" +money.format(getMonthlyInterest()) + "\n" +
                "Date Opened: " + "\t\t\t" +dateCreated;
    }
}





