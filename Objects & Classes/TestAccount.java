import java.text.NumberFormat;

public class TestAccount
{
    public static void main(String[] args)
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //Create an account object with ID 123456 and balance 10,000
        Account myObject = new Account(123456,10000.00);

        //Set the annual interest rate to 2.5%
        myObject.setAnnualInterestRate(2.5);

        //Withdraw $3500
        myObject.withdraw(3500.00);

        //Deposit $500
        myObject.deposit(500.00);

        //Print the account balance
        System.out.println("Account Balance: "+ currency.format(myObject.getBalance()));

        //Print out the earned monthly interest
        System.out.println("Monthly Interest: " + currency.format(myObject.getMonthlyInterest()));

        //Print out the date the account was created
        System.out.println("Date Created: " + myObject.getDateCreated());

        System.out.println(myObject);
    }
}
