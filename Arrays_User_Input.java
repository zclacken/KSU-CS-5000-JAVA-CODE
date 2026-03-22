//allow user to input elements of array

import java.util.Scanner;

public class Arrays_User_Input
{
    public static void main (String[] args)
    {
        //define array and its length
        double[] myDecimals = new double[5];

        //create scanner for input
        java.util.Scanner input = new java.util.Scanner(System.in);


        //user input prompt
        System.out.print("Enter " + myDecimals.length + " decimal values: ");

        //for loop to allow user input
        for(int i = 0; i < myDecimals.length; i++)
            myDecimals[i] = input.nextDouble();

        //for loop to print array after input is complete
        for(int i = 0; i < myDecimals.length; i++)
            System.out.println("Index number " + i + " = " + myDecimals[i]);
    }
}


