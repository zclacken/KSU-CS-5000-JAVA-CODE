//CS 5000
//Spring 2026
// Zara Clacken
//Dr. Haddad
//Assignment 3
//Program #1
//IDE: IntelliJ

import java.util.Scanner;
public class StringMethods
{
    public static void main(String[] args)
    {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word 1: "); //Prompt string input 1
        String string_1 = input.next(); //Input string 1
        System.out.print("Enter word 2: "); //Prompt string input 2
        String string_2 = input.next(); //Input string 2

        // Part A: Determine the length of string_1
        int length1 = string_1.length();
        // Part B: Determine the length of string_2
        int length2 = string_2.length();
        //Part C: Concatenate Strings
        String concatenation = string_1.concat(" " + string_2);
        //Part D: Determine if strings are equal and create conditional variable for output
        String comparison = (string_1.equals(string_2)) ? "Equal":"Not equal";
        //Part E: Convert string 1 letters to all caps
        String uppercase1 = string_1.toUpperCase();
        //Part F: Convert string 2 letters to all lowercase
        String lowercase2 = string_2.toLowerCase();
        //Part G: Extract valid substring oh from John
        String substring = string_1.substring(1,3);

        //Print Outputs
        System.out.println("Length of String 1: " + "\t"  + length1 + " characters");
        System.out.println("Length of String 2: " + "\t" + length2 + " characters");
        System.out.println("Concatenation: " + "\t\t\t" + concatenation);
        System.out.println("Equal Strings? " + "\t\t\t"+ comparison);
        System.out.println("Uppercase String 1 " + "\t\t\t" + uppercase1);
        System.out.println("Lowercase String 2 " + "\t\t\t" + lowercase2);
        System.out.println("Valid Substring: " + "\t\t\t"  + substring);
    }
}
