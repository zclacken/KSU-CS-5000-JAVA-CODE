//Create an if_else statement using a ternary operator
//Shorter than a binary If Else Statement

import java.util.Scanner;

public class Ternary_If_Else_Statement
{
    public static void main(String[] args)
    {
        int A,B;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A: ");
        A = input.nextInt();
        System.out.println("Enter B: ");
        B = input.nextInt();

        String result = (A >= B) ? ("A is greater than B") : ("B is greater than A");
        System.out.println(result);
    }
}
