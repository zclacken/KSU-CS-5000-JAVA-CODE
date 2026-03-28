//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 7
//Program #1
//IDE: IntelliJ

import java.util.Scanner; //import scanner

public class WeeklyHours
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //create scanner
        String response = ""; //create string for user to enter response to prompt

        do
        {
            String[] colTitles = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"}; //column titles array
            String[] rowTitles = {"Employee1", "Employee2","Employee3"}; //row titles array
            int [][] workHours = new int [3][7]; //work hours matrix

            //Populate the table with random numbers
            for(int i = 0; i < workHours.length; i++)
                for(int j = 0; j < workHours[i].length; j++)
                    workHours[i][j] = (int)(Math.random() * 11);//generates integers between 0 and 10

            //Print column titles
            System.out.printf("%-12s",""); //spacing for row titles
            for(int j = 0; j < colTitles.length; j++)
            {
                System.out.printf("%-6s", colTitles[j]); //print column titles and space between titles
            }
            System.out.println(); //space to start Employee1 on next line

            //Print row titles
            for(int i = 0; i < workHours.length; i++)
            {
                System.out.print(rowTitles[i] + "\t "); //print row titles and spacing between column 1
                for(int j = 0; j < workHours[i].length; j++)
                {
                    System.out.printf("%-6s", workHours[i][j]); //print column elements and spacing between them
                }
                System.out.println(); //move to the next line
            }

            //Call addHours method
            int [] totals = addHours(workHours); //Call addHours method

            //print Summary Table
            System.out.println(); //space between tables

            System.out.println("Employee#   Weekly Hours");//column titles
            System.out.println("----------------------------"); //dotted line

            for(int i = 0; i < rowTitles.length; i++)
            {
                System.out.printf("%-12s %d%n", (i + 1), totals[i]);//print spacing, employee number, and sum
            }
            System.out.println(); //blank space

            //Sentinel Prompt
            System.out.println("Rerun the program? (y/n): "); //print user prompt
            response = input.next(); //allow user input
        }
        while(response.equalsIgnoreCase("y"));//condition for rerunning program
    }

    //Create addHours method
    public static int [] addHours(int [][] h)
    {
        int [] totals = new int[h.length];

       for(int row = 0;row < h.length; row++)
       {
           int rowTotal = 0; //resets rowTotal so each row gets its own sum
           for(int column = 0; column < h[row].length; column++)
           {
               rowTotal = rowTotal + h[row][column]; //calculate total hours per employee
           }
           totals[row] = rowTotal;
       }
       return totals;
    }
}
