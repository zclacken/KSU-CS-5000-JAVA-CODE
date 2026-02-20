//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 4
//Program #1
//IDE: IntelliJ

import java.util.Scanner;
public class InputSum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Define rerun input as string
        String rerun = "y";
        //Create while loop allowing user to rerun the program within
        while(rerun.equalsIgnoreCase("y"))//allows user to input y or Y for yes
        {
            //define sum and values as integers
            int sum = 0, value;
            //store entered numbers as string variables
            String entered_numbers = "";
            //print user input prompt
            System.out.print("Enter positive integers (-1 to quit): ");
            //user input
            value = scan.nextInt();
            //create While loop to set -1 as sentinel value
            while (value != -1)
            {
                //set positive integer condition for sum during loop
                if (value >= 0)
                {
                    sum = sum + value;
                    //concatenate entered numbers - condition: no comma before first number
                    if (entered_numbers.equals(""))
                    {
                        entered_numbers = entered_numbers.concat("" + value);
                    }
                    else
                    {
                        entered_numbers = entered_numbers.concat("," + " " + value);
                    }
                }
                //input succeeding values during loop
                value = scan.nextInt();
            }

            //add blank line between input and outputs
            System.out.println();

            //print positive integers
            System.out.println("Entered numbers: " + entered_numbers);
            //print sum of positive integers
            System.out.println("The sum: " + sum);
            //add another blank line
            System.out.println();

            //prompt user to rerun program
            System.out.print("Rerun the program (y/n?): ");
            //enter new inputs to rerun the program
            rerun = scan.next();

            //add blank line
            System.out.println();
        }
    }
}
