//Program I created for indexing a character of a string
//syntax: string_name.charAt(indexnumber)
//e.g. sentence.charAt(3) returns the 3rd character of the string called sentence.

import java.util.Scanner;

public class Index_Character_of_a_String
{
    public static void main(String[] args)
    {
        String suffix = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String sentence = input.nextLine();
        System.out.println("Enter character number: ");
        int indexnumber = input.nextInt();

        char ch = sentence.charAt(indexnumber);

        if(indexnumber == 1)
        {
            suffix = "st";
        }
        else if (indexnumber == 2)
        {
            suffix = "nd";
        }
        else if (indexnumber == 3)
        {
            suffix = "rd";
        }
        else
        {
            suffix = "th";
        }

        System.out.println("The " + indexnumber + suffix + " character of your sentence is " + ch);
    }
}