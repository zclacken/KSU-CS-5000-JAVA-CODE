//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 7
//Program #2
//IDE: IntelliJ

import java.util.Scanner; //import scanner

public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);; //create scanner
        String response = ""; //create string for user to enter response to prompt

        do
        {
            //Allow user to input matrix A
            int [][] matrixA  = new int[3][3]; //Declare Array
            System.out.println("Enter " + matrixA.length + " rows and " +
                    matrixA[0].length + " columns (Matrix A): ");

            for(int row = 0; row < matrixA.length; row++)
            {
                for (int column = 0; column < matrixA[row].length; column++)
                {
                    matrixA[row][column] = input.nextInt();
                }
            }

            //Allow user to input matrix B
            int [][] matrixB = new int[3][3]; //Declare Array
            System.out.println("Enter " + matrixB.length + " rows and " +
                    matrixB[0].length + " columns (Matrix B): ");

            for(int row = 0; row < matrixB.length; row++)
            {
                for (int column = 0; column < matrixB[row].length; column++)
                {
                    matrixB[row][column] = input.nextInt();
                }
            }

            //Print Matrix A
            System.out.println(); //blank space
            System.out.println("Matrix A: ");
            for(int row = 0; row < matrixA.length; row++)
            {
                for(int column = 0; column < matrixA[row].length; column++)
                {
                    System.out.printf( "%6d", matrixA[row][column]);
                }

                System.out.println(); //go to next row
            }
            System.out.println(); //blank space

            //Print Matrix B
            System.out.println("Matrix B: ");
            for(int row = 0; row < matrixB.length; row++)
            {
                for(int column = 0; column < matrixB[row].length; column++)
                {
                    System.out.printf( "%6d", matrixB[row][column]);
                }

                System.out.println(); //go to next row
            }
            System.out.println(); // blank space

            //call add method
            int [][] sum = add(matrixA, matrixB);

            //Print Matrix A + B
            System.out.println("Matrix A+B: ");
            for(int i = 0; i < sum.length; i++)
            {
                for (int j = 0; j < sum[0].length; j++)
                {
                    System.out.printf("%6d",sum[i][j]);
                }
                System.out.println(); //blank space
            }

            //Sentinel Prompt
            System.out.println(); //blank space
            System.out.println("Rerun the program? (y/n): "); //print user prompt
            response = input.next(); //allow user input

        }while(response.equalsIgnoreCase("y"));//condition for rerunning program
    }


    //Create add method
    public static int [][] add(int [][] matrixA,int [][] matrixB)
    {
        int rows = matrixA.length; //create variable for rows
        int cols = matrixA[0].length; //create variable for columns

        int[][] sum = new int[rows][cols]; //Declare Array

        for(int i = 0; i < rows; i++) //loop to sum elements
        {
            for(int j = 0; j < cols; j++)
            {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sum;
    }
}
