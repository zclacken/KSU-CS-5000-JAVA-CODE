//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 6
//Program #1
//IDE: IntelliJ

import java.util.Scanner; //import Scanner utility

public class CountOccurrences
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //define scanner
        String rerun;//create string for sentinel loop

        //Nested Do_While Loop to allow input to build array
        do
        {
            //define length of array
            int[] numbersList = new int[10];

            //set integer count from 0
            int count = 0;

            //define input as integer
            int input = 0;

            //define min and max values for input
            final int Max = 100;
            final int Min = 1;

            //Prompt user input
            System.out.println("Enter up to " + numbersList.length + " integers between " +
                    Min + " and " + Max + " (0 to stop): ");

            //while loop for input
            while(count < numbersList.length)
            {
              input = scan.nextInt();
              //set 0 to end loop
              if(input == 0)
                  break;
              //define lower and upper limit of input
              if(input >= Min && input <= Max)
              {
                  numbersList[count] = input;
                  count++;
              }
            }
            System.out.println(); //blank line
            //count method within loop
            Count(numbersList,count);
            //Prompt user to rerun program
            System.out.print("Rerun program? (y/n): ");
            //rerun user input
            rerun = scan.next();
        }
        //ignore uppercase and lowercase for Y
        while (rerun.equalsIgnoreCase("y"));
    }

    //Generate Method to count and print occurrences
    public static void Count(int[] arr, int size)
    {
        for(int i = 0; i < size ; i++)
        {
            boolean alreadyCounted = false;

            //Check if value is already counted
            for(int j = 0; j < i; j++)
            {
                if(arr[i] == arr[j])
                {
                    alreadyCounted = true;
                    break;
                }
            }
            if(!alreadyCounted)
            {
                int occurrences = 0;

                for(int k = 0; k < size; k++)
                {
                    if(arr[k] == arr[i])
                        occurrences++;
                }

                //Print with time or times depending on number
                if(occurrences > 1)
                    System.out.println(arr[i] + " occurred " + occurrences + " times");
                else
                    System.out.println(arr[i] + " occurred " + occurrences + " time");

            }
        }
    }
}
