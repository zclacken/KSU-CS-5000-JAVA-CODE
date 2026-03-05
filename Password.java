//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 5
//Program #1
//IDE: IntelliJ


import java.util.Scanner;

public class Password
{
    //Master method that checks all rules
    public static boolean CheckPassword(String password)
    {
        if
        (
                mincharlength(password) &&
                        onlylettersanddigits(password) &&
                        atleastthreedigits(password) &&
                        atleastthreelowercase(password) &&
                        atleastthreeuppercase(password)
        )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Rule 1: Has at least 9 characters
    public static boolean mincharlength(String password)
    {
        if(password.length() >= 9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Rule 2: Has only letters and digits
    public static boolean onlylettersanddigits(String password)
    {
      for (int i = 0; i < password.length(); i++)
      {
         if(!Character.isLetterOrDigit(password.charAt(i)))
         {
             return false;
         }
      }
      return true;
    }

    //Rule 3: Has at least three digits
    public static boolean atleastthreedigits(String password)
    {
      int digitcount = 0;

      for(int i = 0; i<password.length(); i++)
      {
          if(Character.isDigit(password.charAt(i)))
          {
              digitcount++;
          }
      }
      if (digitcount >= 3)
      {
          return true;
      }
      else
      {
          return false;
      }
    }

    //Rule 4: has at least 3 lowercase letters
    public static boolean atleastthreelowercase(String password)
    {
        int lowercount = 0;
        for(int i = 0; i < password.length(); i++)
        {
            if(Character.isLowerCase(password.charAt(i)))
            {
                lowercount++;
            }
        }

        if(lowercount >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Rule 5: has at least 3 uppercase letters
    public static boolean atleastthreeuppercase(String password)
    {
       int uppercount = 0;

       for (int i = 0; i < password.length(); i++)
       {
          if(Character.isUpperCase((password.charAt(i))))
          {
              uppercount++;
          }

          if (uppercount >= 3)
          {
              return true;
          }
       }
        return false;
    }

    // Main method to allow user to rerun the program
        public static void main(String[] args)
        {
           Scanner scan = new Scanner(System.in);
           String password;
           String rerun = "y";

           while(rerun.equalsIgnoreCase("y")) //allow user to input Y or y
           {
               System.out.print("Enter a password: ");
               password = scan.nextLine();

               System.out.println("Entered password: " + password);

               if(CheckPassword(password))
               {
                   System.out.println("Judgment" + "\t\t" + "  Valid Password");
               }
               else
               {
                   System.out.println("Judgment" + "\t\t" + "  Invalid Password");
               }
               System.out.println("\n"); //blank line
               System.out.print("Enter another password? (y/n): "); //prompt rerun of program
               rerun = scan.nextLine(); //rerun program
           }
        }
}