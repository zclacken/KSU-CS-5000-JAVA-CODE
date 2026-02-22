//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 4
//Program #3
//IDE: IntelliJ

public class Pattern
{
    public static void main(String[] args)
    {
        final int MAX_ROWS = 6; //define max number of rows
        System.out.println(); //print blank space
        for (int row = MAX_ROWS; row >= 1; row--) //set number of digits in each row
        {
            for (int count = 1; count <= row; count++) //create sequence for each row
                System.out.print(count + " ");
            System.out.println(); //print blank space
        }
    }
}
