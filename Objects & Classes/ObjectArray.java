//Create Object Array called circleArray and print total areas of the circles

public class ObjectArray
{
    public static void main(String[] args)
    {
        Circle_With_Private_Data_Fields[] circleArray; //Declare circleArray
        circleArray = createCircleArray(); //Create the circleArray

        //Print circleArray and the total areas of the circles
        printCircleArray(circleArray);
    }

    //Create an array of Circle objects
    public static Circle_With_Private_Data_Fields[] createCircleArray()
    {
        Circle_With_Private_Data_Fields[] circleArray =
                new Circle_With_Private_Data_Fields[5];

        for (int i = 0; i < circleArray.length; i++)
        {
            circleArray[i] = new Circle_With_Private_Data_Fields(Math.random() * 100);
        }
        return circleArray; //Return Circle Array
    }

    //Print an array of circles and their total area
    public static void printCircleArray(
            Circle_With_Private_Data_Fields[] circleArray)
    {
        System.out.println("Radius" + "\t\t\t\t" + "Area");
        for (int i = 0; i < circleArray.length; i++)
        {
            System.out.println(circleArray[i].getRadius() + "\t\t" +
                    circleArray[i].getArea());
        }

        System.out.println("-----------------");

        //Compute and display the result
        System.out.println("The total areas of circles is\t" + sum(circleArray));
    }

    //Static method to add up the circle areas
    public static double sum(Circle_With_Private_Data_Fields[] circleArray)
    {
        double sum = 0; //Initialize sum

        for (int i = 0; i < circleArray.length; i++)
            sum = sum + circleArray[i].getArea();
        return sum;
    }
}
