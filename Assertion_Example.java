//Assertions stop running the program if expression is false
//If Statements keep running, even if expression is false, allowing an output for FALSE

import java.util.Scanner;
class Assertion_Example
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter your age (>= 18): ");

        int age = scanner.nextInt();
        //check the assumption, quit if value is less than 18
        assert age >= 18 : age + " is invalid input for age.";

        System.out.println("Entered age value is " + age);
    }
}




