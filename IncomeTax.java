//CS 5000
//Spring 2026
// Zara Clacken
//Dr. Haddad
//Assignment 2
//Program #1
//IDE: IntelliJ

import java.text.NumberFormat;//import number format
import java.util.Scanner; //import scanner for user input
public class IncomeTax
{
    public static void main (String [] args) //set main
    {
        Scanner scan = new Scanner(System.in); //create scanner
        System.out.println("Enter income: "); //user input prompt
        int income = scan.nextInt(); //input object

        NumberFormat fmt = NumberFormat.getCurrencyInstance(); //format currency
        NumberFormat pct = NumberFormat.getPercentInstance(); //format percentage

        // else_if with block statements to print out income, tax bracket, and tax amount
        if(income > 30000 && income <= 70000)
        {
            System.out.print("Your income:  " + "\t\t"+ fmt.format(income) + "\n");
            System.out.print("Your tax bracket:  " + "\t"+ pct.format(.10) + "\n");
            System.out.print("Your tax amount:  " + "\t"+ fmt.format(income * .10));
        }
        else if (income > 70000 && income <= 150000)
        {
            System.out.print("Your income:  " + "\t\t" + fmt.format(income) + "\n" );
            System.out.print("Your tax bracket:  " + "\t"+ pct.format(.15) + "\n");
            System.out.print("Your tax amount:  " + "\t"+ fmt.format(income * .15));
        }
        else if (income > 150000 && income <= 300000)
        {
            System.out.print("Your income:  " + "\t\t" + fmt.format(income) + "\n");
            System.out.print("Your tax bracket:  " + "\t"+ pct.format(.20) + "\n");
            System.out.print("Your tax amount:  " + "\t"+ fmt.format(income * .20));
        }
        else if (income > 300000 && income <= 900000)
        {
            System.out.print("Your income:  " + "\t\t" + fmt.format(income) + "\n");
            System.out.print("Your tax bracket:  " + "\t"+ pct.format(.35) + "\n");
            System.out.print("Your tax amount:  " + "\t"+ fmt.format(income * .35));
        }
        else if (income > 900000)
        {
            System.out.print("Your income:  " + "\t\t" + fmt.format(income) + "\n");
            System.out.print("Your tax bracket:  " + "\t"+ pct.format(.40) + "\n");
            System.out.print("Your tax amount:  " + "\t"+ fmt.format(income * .4));
        }
        else
        {
            System.out.print("Your income:" + "\t\t"+ fmt.format(income) + "\n");
            System.out.print("Your tax bracket:" + "\t"+ pct.format(.03) + "\n");
            System.out.print("Your tax amount:" + "\t"+ fmt.format(income * .03 ));
        }
    }
}
