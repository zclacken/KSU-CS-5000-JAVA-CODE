//Create a conditional using Switch_case_default
//Equivalent is usage to If_Else Statement
//If-else is best for boolean; Switch is best for integers and characters

import java.util.Scanner;

public class Conditional_Switch_Statement
{
    public static void main(String[] args)

    {
        int grade,category;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade: ");
        grade = input.nextInt();
        category = grade/10;
        System.out.println("Your grade is: ");

        switch(category)
        {
            case 10:
                System.out.println("Perfect Score");
                break;
            case 9:
                System.out.println("Well Above Average");
                break;
            case 8:
                System.out.println("Above Average");
                break;
            case 7:
                System.out.println("Average");
                break;
            case 6:
                System.out.println("Below Average");
                break;
            default:
                System.out.println("Fail");
        }
    }
}