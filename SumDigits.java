// Class: CS 5000
// Term:  Spring 2026
// Name:  Zara Clacken
// Instructor: Dr. Haddad
// Assignment: 1
// Program: 2
// IDE: IntelliJ

//Write a java program, named SumDigits, to read from the user an integer number (as numeric value, using integer variable and method nextInt() of the scanner class). 
//Assume the input value is limited to between 0 and 9999. The program computes and displays the sum of the digits in the number 
//(Do not use loops or treat the number as string of characters). Manipulate the input number mathematically using proper math operators (division and remainder) to determine the sum of its digits.

import java.util.Scanner; //import scanner class
public class SumDigits
{
    public static void main(String[] args) //program main method
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 4-digit number (integer): ");//prompt user input

        // define input variable type
        int number = input.nextInt();

        //perform digit extraction
        int d1 = number % 10;
        int d2 = (number/10) % 10;
        int d3 = (number/100) % 10;
        int d4 = number/1000;

        //calculate sum of digits
        int sum = d1 + d2 + d3 +d4;

        System.out.println("The input number is: " + "\t" + number); //print input number
        System.out.println("The sum of digits is:" + "\t" + sum); //print sum of digits
    }
}

