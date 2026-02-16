//CS 5000
//Spring 2026
// Zara Clacken
//Dr. Haddad
//Assignment 3
//Program #2
//IDE: IntelliJ

public class RandomNumbers
{
    public static void main (String [] args)
    {
        //Part A: Generate a random integer number between 20 and 80 (inclusive)
        int randomnumberA = (int)(Math.random() * 61) + 20;
        //Part B: Generate a random integer number between -20 and 20 (inclusive)
        int randomnumberB = (int)(Math.random() * 41) - 20;
        //Part C: Generate a random integer number between -50 and -20 (inclusive)
        int randomnumberC = (int)(Math.random() * 31) - 50;
        //Part D:  Generate a random floating-point number between 0.0 and 21.9999 (inclusive)
        float randomnumberD = (float)(Math.random() * 22);

        //Print outputs

        //Print random integer number between 20 and 80 (inclusive)
        System.out.println("a) A random integer between 20 and 80 (inclusive): " +  "\t\t"     +randomnumberA);
        //Print random integer number between -20 and 20 (inclusive)
        System.out.println("b) A random integer between -20 and 20 (inclusive): " +  "\t"    +randomnumberB);
        //Print a random integer number between -50 and -20 (inclusive)
        System.out.println("c) A random integer between -50 and -20 (inclusive): " + "\t"    +randomnumberC);
        //Print a random floating-point number between 0.0 and 21.9999 (inclusive)
        System.out.println("d) A random float between 0.0 and 21.9999 (inclusive): " + "\t"  +randomnumberD);
    }
}
