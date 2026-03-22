//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 6
//Program #2
//IDE: IntelliJ

import java.util.Scanner;

public class TestIndexOfLargest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String rerun;

        do
        {
            int[] integerValues = new int[10];

            System.out.print("Enter " + integerValues.length + " integer values: " );

            for (int i = 0; i < integerValues.length; i++)
            {
                integerValues[i] = scan.nextInt();
            }

            //Display entered values
            System.out.print("You entered these values: " + "\t");
            for (int num: integerValues)
            {
                System.out.print(num + " ");
            }

            //Call method
            int index = IndexOfLargest.findIndex(integerValues);

            //Display result
            System.out.println("\nIndex of largest value: " + "\t" + index);

            //Blank line
            System.out.println();

            //Sentinel Loop
            System.out.print("Rerun the program? (y/n): ");
            rerun = scan.next();

            System.out.println(); //blank line

        } while(rerun.equalsIgnoreCase("y"));
    }

}
