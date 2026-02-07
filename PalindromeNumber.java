//CS 5000
//Spring 2026
// Zara Clacken
//Dr. Haddad
//Assignment 2
//Program #2
//IDE: IntelliJ

import java.util.Scanner; // import scanner for user input
public class PalindromeNumber
{
    public static void main (String[] args) //set main
    {
        Scanner scan = new Scanner(System.in); //create scanner
        System.out.print ("Please enter a 5-digit integer value: "); //user input prompt
        int number = scan.nextInt(); //input object

        //Extract digits from number using division and remainder
        int digit1 = number/10000; //the first digit
        int digit2 = (number/1000) % 10; //the second digit
        int digit4 = (number/10) % 10; // the fourth digit
        int digit5 = number % 10; // the fifth digit

        if (number < 10000 || number > 99999) // set condition for integers that are not 5 digits
        {
            System.out.println("Input value:" + "\t\t" + number);
            System.out.println("Judgment:" + "\t\t\t" + "Invalid input, must be 5 digit number.");
        }
        else if (digit1 == digit5 && digit2 == digit4) // set condition for palindromes
        {
            System.out.println("Input value:" + "\t\t" + number);
            System.out.println("Judgment:" + "\t\t\t" + "Palindrome");
        }
        else {
            System.out.println("Input value:" + "\t\t" + number); // set condition for not palindrome
            System.out.println("Judgment:" + "\t\t\t" + "Not Palindrome");
        }
    }
}
