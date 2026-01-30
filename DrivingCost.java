// Class: CS 5000
// Term:  Spring 2026
// Name:  Zara Clacken
// Instructor: Dr. Haddad
// Assignment: 1
// Program: 3
// IDE: IntelliJ

// Write a java program, named DrivingCost, to compute the driving cost of a trip. 
//The program prompts the user to enter the distance to drive (in miles) as double value, the fuel efficiency of 
//the car (mpg) as double value, and the price per gallon (price) as double value. Then the program computes 
//the cost of the trip and displays the output as follows. 
// Use Java tabs character (\t) to line-up the outputs after the labels


import java.util.Scanner; //import scanner class
public class DrivingCost
{
    public static void main(String[] args)// program main method
    {
        //prompt user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance (miles): ");
        double distance = input.nextDouble();
        System.out.print("Enter fuel efficiency (mpg): ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon (dollars): ");
        double ppg = input.nextDouble();

        //calculate trip cost
        double tripcost = (distance/mpg)*ppg;

        //print output
        System.out.println("The distance (miles):" +
                "\t"+ distance); //print distance
        System.out.println("Fuel efficiency (mpg):" +
                "\t" +  mpg); //print fuel efficiency
        System.out.println("Price per gallon (dollars):" +
                "\t" + "$" + ppg); //print price per gallon
        System.out.println("The trip cost:" + "\t" + "$"
                + tripcost); //print trip cost

    }

}


