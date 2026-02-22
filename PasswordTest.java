//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 4
//Program #2
//IDE: IntelliJ

import java.util.Scanner;
public class PasswordTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Define rerun input as string
        String rerun = "y";
        //Create while loop allowing user to rerun the program within
        while(rerun.equalsIgnoreCase("y")) //allows user to input y or Y for yes   
        {
            //define password as a string
            String password = "";
            //input password prompt
            System.out.print("Enter password: ");
            //input password
            password = scan.nextLine();

            //define counts as integers
            int passwordlength = password.length();
            int uppercasecount = 0;
            int lowercasecount = 0;
            int digitcount = 0;
            int specialcharactercount = 0;

            //Define verdict as string
            String verdict = "";;

            //for loop to count characters
            for(int i = 0; i < password.length(); i++)
            {
                char ch = password.charAt(i);
                if(Character.isUpperCase(ch)) //count uppercase characters
                {
                    uppercasecount++;
                }
                else if (Character.isLowerCase(ch)) //count lowercase characters
                {
                    lowercasecount++;
                }
                else if (Character.isDigit(ch)) //count digits
                {
                    digitcount++;
                }
                else
                {
                    specialcharactercount++; //count characters that are neither digit nor letter
                }
            }


            //Define condition for valid and invalid password using ternary operator
            verdict = (passwordlength >= 7 &&
                    lowercasecount > 0 &&
                    uppercasecount > 0 &&
                    digitcount > 0 &&
                    specialcharactercount > 0)
                    ? "Valid Password" //Output if true
                    : "Invalid Password"; //Output if false

            //Print Outputs
            System.out.println("Entered Password:"+ "\t" + password);
            System.out.println("Verdict:" + "\t\t\t" + verdict);
            System.out.println();

            //prompt user to rerun program
            System.out.print("Rerun the program (y/n?): ");
            //enter new inputs to rerun the program
            rerun = scan.nextLine();
        }
    }
}
