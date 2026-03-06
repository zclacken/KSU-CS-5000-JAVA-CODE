//Determine the class of a character input by the user
//there is no way to create a scanner with just a character
//therefore, you must use String methods 

import java.util.Scanner;

public class Character_Classes_User_Input
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter: ");
        String letter = input.nextLine();

        //define the string entered as a character
        //0 represents the first letter of a string
        char ch = letter.charAt(0);


        //determine if the character entered is upper case or lower case
        if(Character.isUpperCase(ch))
        {
            System.out.println("Character is upper case");
        }
        else
        {
            System.out.println("Character is lower case");
        }
    }
}