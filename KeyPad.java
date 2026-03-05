//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 5
//Program #2
//IDE: IntelliJ

import java.util.Scanner;

public class KeyPad
{
    public static int getNumber(char uppercaseLetter)
    {
        if(uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
            return 2;
        else if(uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
            return 3;
        else if(uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
            return 4;
        else if(uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
            return 5;
        else if(uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
            return 6;
        else if(uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
            return 7;
        else if(uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
            return 8;
        else if(uppercaseLetter >= 'W' && uppercaseLetter <= 'Z')
            return 9;
        else
            return -1;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        String rerun = "y";

        do
        {
            System.out.print("Enter phone number: ");
            phoneNumber = input.nextLine();

            System.out.println("You entered: " + "\t" + phoneNumber);

            //convert input to uppercase letters
            String upperPhone = phoneNumber.toUpperCase();
            String convertedNumber = "";

            //Process each character
            for(int i = 0; i < upperPhone.length(); i++)
            {
                char ch = upperPhone.charAt(i);

                if(Character.isLetter(ch))
                {
                    convertedNumber = convertedNumber + getNumber(ch);
                }
                else
                {
                    //Keep digits and special characters unchanged
                    convertedNumber = convertedNumber + ch;
                }
            }
            System.out.println("Phone Number: " + "\t" + convertedNumber);
            System.out.println("\n"); //blank line

            System.out.print("Enter another phone number? (y/n) ");

            rerun = String.valueOf(input.nextLine().toUpperCase().charAt(0)); //rerun program
        }
        while (rerun.equalsIgnoreCase("y")); //allow user to input Y or y)
    }
}



