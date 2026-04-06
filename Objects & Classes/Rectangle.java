//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 8
//Program #2
//IDE: IntelliJ

public class Rectangle {

    //Private data fields with default values
    private double width = 1.00;
    private double height = 1.00;

    //Non-argument constructor (default rectangle)
    public Rectangle() {}

    // Constructor with specified width and height
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    //Getter methods
    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    //Method to calculate area
    public double getArea()
    {
        return width * height;
    }

    //Method to calculate perimeter
    public double getPerimeter()
    {
        return 2 * (width + height);
    }

    //Method to print a meaningful description
    public String toString(String objectName)
    {
        return "Rectangle " + objectName + " is "
                + width + " units wide and "
                + height + " units high.";
    }
}