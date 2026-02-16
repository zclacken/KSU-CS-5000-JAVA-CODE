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
        Scanner input = new Scanner(System.in); //Create scanner
        System.out.print("Enter string 1: "); //Prompt string input 1
        String string_1 = input.next(); //Input string 1
        System.out.print("Enter string 2: "); //Prompt string input 2
        String string_2 = input.next(); //Input string 2

        // Part A: Determine the length of string_1
        int length1 = string_1.length();
        // Part B: Determine the length of string_2
        int length2 = string_2.length();
        //Part C: Concatenate Strings
        String concatenation = string_1.concat(" " + string_2);
        //Part D: Determine if strings are equal
        String comparison = (string_1.equals(string_2)) ? "Equal":"Not equal";
        //Part E: Convert all string 1 letters to upper case
        String uppercase1 = string_1.toUpperCase();
        //Part F: Convert all string 2 letters to lower case
        String lowercase2 = string_2.toLowerCase();
        //Part G: Extract valid substring from string 1
        String substring = string_1.substring(1,3);

        //Print Outputs

        //Print length of string 1
        System.out.println("a) Length of String 1: " + "\t"  + length1 + " characters");
        //Print length of string 2
        System.out.println("b) Length of String 2: " + "\t" + length2 + " characters");
        //print concatenation
        System.out.println("c) Concatenation: " + "\t\t" + concatenation);
        //Print comparison of strings: equal or not equal
        System.out.println("d) Equal Strings?: " + "\t\t"+ comparison);
        //Print string 1 in all uppercase
        System.out.println("e) Uppercase String 1: " + "\t" + uppercase1);
        //Print string 2 in all lowercase
        System.out.println("f) Lowercase String 2: " + "\t" + lowercase2);
        //Print substring of string 1
        System.out.println("g) Valid Substring: " + "\t"  + substring);
    }
}
