//Program with a visibility modifier to make data fields private
public class Circle_With_Private_Data_Fields
{
    private double radius = 1;
    private static int numberOfObjects = 0;

    public Circle_With_Private_Data_Fields(){numberOfObjects++;}

    public Circle_With_Private_Data_Fields(double newRadius)
    {
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius(){return radius;}

    public void setRadius(double newRadius)
    {
        radius = (newRadius >= 0) ? newRadius: 0; //no negative radius
    }

    public static int getNumberOfObjects(){return numberOfObjects;}

    public double getArea(){return radius*radius*Math.PI;}
}

class TestCircleWithPrivateDataFields
{
    public static void main(String[] args)
    {//Main Method

        //Create a Circle with radius 10.0
        Circle_With_Private_Data_Fields myCircle =
                new Circle_With_Private_Data_Fields(10.0);

        System.out.println("The area of the circle of radius "
                            + myCircle.getRadius() + " is " +
                                myCircle.getArea());

        //Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);

        System.out.println("The area of the circle of radius " +
                            myCircle.getRadius() + " is " +
                            myCircle.getArea());

    }
}
