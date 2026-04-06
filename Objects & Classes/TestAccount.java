import java.util.Scanner;
import java.text.NumberFormat;

public class TestAccount
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat fmt = NumberFormat.getPercentInstance();
        fmt.setMaximumFractionDigits(1);

        //Create string to prompt rerunning the program
        String rerun = "y";

        //Create Sentinel Loop
        while(rerun.equalsIgnoreCase("y"))
        {
            //Print User Prompts and allow input for my account
            System.out.print("Enter myAccount ID: ");
            int myID = input.nextInt();
            System.out.print("Enter myAccount Balance: ");
            double myBalance = input.nextDouble();
            System.out.print("Enter myAccount's Annual Interest Rate (e.g., 2.5): ");
            double myRate = input.nextDouble();

            //Print User Prompts and allow input for your account
            System.out.print("Enter yourAccount ID: ");
            int yourID = input.nextInt();
            System.out.print("Enter yourAccount Balance: ");
            double yourBalance = input.nextDouble();
            System.out.print("Enter yourAccount's Annual Interest Rate (e.g., 2.5): ");
            double yourRate = input.nextDouble();

            //Create Objects myAccount and yourAccount
            Account myAccount = new Account(myID, myBalance);
            Account yourAccount = new Account(yourID, yourBalance);

            // set the interest rates
            myAccount.setAnnualInterestRate(myRate);
            yourAccount.setAnnualInterestRate(yourRate);

            // display myAccount information for initial deposit
            System.out.println(); //Blank Space
            System.out.println("Initial myAccount Information:");
            System.out.println("ID: " + "\t\t\t\t\t" + myAccount.getId());
            System.out.println("Balance: " + "\t\t\t\t" +
                    money.format(myAccount.getBalance()));
            System.out.println("Annual Interest Rate: " + "\t" +
                    fmt.format(myAccount.getAnnualInterestRate()));

            // deposit test for my account
            System.out.println();//blank space
            System.out.print("Enter deposit amount for myAccount: ");
            double depositAmt = input.nextDouble();

            myAccount.deposit(depositAmt);

            System.out.println("myAccount Balance after deposit: " +
                    money.format(myAccount.getBalance()));

            // Withdraw test with overdraft check for my account
            System.out.println(); //blank space
            System.out.print("Enter withdrawal amount for myAccount: ");
            double withdrawAmt = input.nextDouble();

            if(withdrawAmt > myAccount.getBalance())
            {
                System.out.println("ERROR: Withdrawal denied (insufficient funds)");
            }
            else
            {
                myAccount.withdraw(withdrawAmt);

                System.out.println("Balance after withdrawal: " +
                        money.format(myAccount.getBalance()));
            }

            // monthly interest test for my account
            System.out.println(); //blank space
            System.out.println("Interest Information for myAccount:");
            System.out.println("Monthly Interest Rate: " + " \t" +
                    fmt.format(myAccount.getMonthlyInterestRate()));

            System.out.println("Monthly Interest Amount: " + "\t" +
                    money.format(myAccount.getMonthlyInterest()));

            //----Tests for yourAccount------

            //Display initial balance information for yourAccount
            System.out.println(); //blank space
            System.out.println("yourAccount Initial values:");
            System.out.println("ID:" + "\t\t\t\t\t\t" + yourAccount.getId());
            System.out.println("Balance:" + "\t\t\t\t" +
                    money.format(yourAccount.getBalance()));
            System.out.println("Annual Interest Rate:" + "\t" +
                    fmt.format(yourAccount.getAnnualInterestRate()));
            System.out.println("Date Created:" + "\t\t\t" +
                    yourAccount.getDateCreated());

            //Test deposit method for yourAccount
            System.out.println(); //Blank Space
            System.out.print("Enter deposit amount for yourAccount: ");
            double yourDeposit = input.nextDouble();

            yourAccount.deposit(yourDeposit);

            System.out.println("Balance after deposit:" +
                    money.format(yourAccount.getBalance()));

            //Test withdrawal method for yourAccount
            System.out.println(); //Blank space
            System.out.print("Enter withdrawal amount for yourAccount: ");
            double yourWithdraw = input.nextDouble();

            if(yourWithdraw > yourAccount.getBalance())
            {
                System.out.println("ERROR: Cannot withdraw more than balance.");
            }
            else
            {
                yourAccount.withdraw(yourWithdraw);

                System.out.println("Balance after withdrawal: " +
                        money.format(yourAccount.getBalance()));
            }

            //Test monthly interest for yourAccount
            System.out.println(); //Blank Space
            System.out.println("Monthly Interest Rate: " + "\t\t" +
                    fmt.format(yourAccount.getMonthlyInterestRate()));

            System.out.println("Monthly Interest Amount: " + "\t" +
                    money.format(yourAccount.getMonthlyInterest()));

            //Sentinel loop prompt
            System.out.println(); //Blank Space
            System.out.print("Run the program again? (y/n): ");
            rerun = input.next();
        }
    }
}
