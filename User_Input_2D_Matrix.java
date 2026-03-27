//2D Matrix allowing user input
//Enter 3 rows and 3 columns

import java.util.Scanner;

public class User_Input_2D_Matrix
{
    public static void main (String[] args)
    {
        java.util.Scanner input = new Scanner(System.in);

        int[][] scores = new int [3][3];

        System.out.println("Enter " + scores.length + " rows and " +
                scores[0].length + " columns: ");

        for(int row = 0; row < scores.length; row++)
        {
            for (int column = 0; column < scores[row].length; column++)
            {
                scores[row][column] = input.nextInt();
            }
        }

        System.out.println(); //blank space above output

        for(int row = 0; row < scores.length; row++)
        {
            for(int column = 0; column < scores[row].length; column++)
            {
                System.out.print(scores[row][column] + " ");
            }

            System.out.println(); //go to next row
        }
    }
}
