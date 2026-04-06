//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 7
//Program #2
//IDE: IntelliJ

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String rerun; //create input variable for user to rerun the program

        //sentinel loop
        do {
            // Create default object
            Rectangle myRectangle = new Rectangle();

            // Prompt user input for hisRectangle
            System.out.println("Enter values for hisRectangle:");

            double width1 = getPositiveInput(input, "Enter width: ");
            double height1 = getPositiveInput(input, "Enter height: ");

            Rectangle hisRectangle = new Rectangle(width1, height1);

            // Read values for herRectangle
            System.out.println(); //Blank Space
            System.out.println("Enter values for herRectangle:");

            double width2 = getPositiveInput(input, "Enter width: ");
            double height2 = getPositiveInput(input, "Enter height: ");

            Rectangle herRectangle = new Rectangle(width2, height2);

            // Display results using class methods
            displayResults(myRectangle, "myRectangle");
            displayResults(hisRectangle, "hisRectangle");
            displayResults(herRectangle, "herRectangle");

            // Sentinel loop
            System.out.println(); //Blank Space
            System.out.print("Run program again? (y/n): ");
            rerun = input.next();

        } while(rerun.equalsIgnoreCase("y"));
    }

    // Method to validate positive input
    public static double getPositiveInput(Scanner input, String message) {

        double value;

        while(true) {

            System.out.print(message);
            value = input.nextDouble();

            if(value > 0) {
                return value;
            }
            else {
                System.out.println("Error: value must be greater than 0. Try again.");
            }
        }
    }

    // Method to display rectangle info using class methods
    public static void displayResults(Rectangle r, String name) {

        System.out.println("\n" + name + ":");
        System.out.println("------------");

        // calling methods from Rectangle class
        System.out.println("Width: " + "\t\t" + r.getWidth());
        System.out.println("Height: " + "\t" + r.getHeight());
        System.out.println("Area: " + "\t\t" + r.getArea());
        System.out.println("Perimeter:" + "\t" + r.getPerimeter());

        // calling toString method from Rectangle class
        System.out.println();
        System.out.println(r.toString(name));
    }
}
