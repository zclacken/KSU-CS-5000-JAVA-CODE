//CS 5000
//Spring 2026
// Zara Clacken
//Dr. Haddad
//Assignment 2
//Program #3
//IDE: IntelliJ

import java.text.NumberFormat; //import number format to format numbers in the output
import java.util.Scanner; //import scanner for user input
public class BestAppleDeal
{
    public static void main (String [] args) // set main
    {
        NumberFormat fmt = NumberFormat.getIntegerInstance(); //format box price as integer in output
        Scanner scan = new Scanner (System.in); //create scanner

        //user input prompts and object input
        System.out.println("Enter small box weight: ");
        int smallweight = scan.nextInt(); //weight of small box
        System.out.println("Enter small box price: ");
        double smallprice = scan.nextInt();  //price of small box
        System.out.println("Enter large box weight: ");
        int largeweight = scan.nextInt(); //weight of large box
        System.out.println("Enter large box price: ");
        double largeprice = scan.nextInt();  //price of large box

        //calculate price per pound
        double smallpriceperpound = smallprice/smallweight; //price per pound of small box
        double largepriceperpound = largeprice/largeweight; //price per pound of large box

        //set conditions to determine best deal using block statements
        if(smallpriceperpound > largepriceperpound) // condition for large box being better deal
        {
            System.out.print("Small box weight: " + "\t" + smallweight + " Pounds" + "\n");
            System.out.print("Small box price: " + "\t" + fmt.format(smallprice) + " Dollars" + "\n");
            System.out.print("Large box weight: " + "\t" + largeweight + " Pounds" + "\n");
            System.out.print("Large box price: " + "\t" + fmt.format(largeprice) + " Dollars" + "\n" );
            System.out.print("Judgment:" + "\t\t\t" + "The large box is a better deal");
        }
        else if (smallpriceperpound < largepriceperpound) // condition for smaller box being better deal
        {
            System.out.print("Small box weight: " + "\t" + smallweight + " Pounds" + "\n");
            System.out.print("Small box price: " + "\t" + fmt.format(smallprice) + " Dollars" + "\n");
            System.out.print("Large box weight: " + "\t" + largeweight + " Pounds" + "\n");
            System.out.print("Large box price: " + "\t" + fmt.format(largeprice) + " Dollars" + "\n");
            System.out.print("Judgment:" + "\t\t\t" +"The smaller box is a better deal");
        }
        else if (smallpriceperpound == largepriceperpound) //condition for boxes being the same value
        {
            System.out.print("Small box weight: " + "\t" + smallweight + " Pounds" + "\n");
            System.out.print("Small box price: " + "\t" + fmt.format(smallprice) + " Dollars" + "\n");
            System.out.print("Large box weight: " + "\t" + largeweight + " Pounds" + "\n");
            System.out.print("Large box price: " + "\t" + fmt.format(largeprice) + " Dollars" + "\n" );
            System.out.print("Judgment:" + "\t\t\t" + "Both boxes are of the same value");
        }
    }
}
