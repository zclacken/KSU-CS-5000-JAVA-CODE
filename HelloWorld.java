// Class: CS 5000
// Term:  Spring 2026
// Name:  Zara Clacken
// Instructor: Dr. Haddad
// Assignment: 1
// Program: 1
// IDE: IntelliJ

import java.util.Scanner; //import scanner class
public class HelloWorld
{
    public static void main (String args[]) //program main method
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Please enter your name: ");//prompt user for input
        String name = s.nextLine(); //read user input
        System.out.println("Hello " + name + "!"); //print message
    }
}


