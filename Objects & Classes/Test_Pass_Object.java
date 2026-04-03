public class Test_Pass_Object
{
    public static void main(String[] args)
    {
        Circle_With_Private_Data_Fields myCircle =
                new Circle_With_Private_Data_Fields(1);

        //Print areas for radius 1,2,3,4, and 5.
        int n = 5;
        printAreas(myCircle,n);

        //Print myCircle.radius and times
        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle_With_Private_Data_Fields c, int times)
    {
        System.out.println("Radius\t\tArea");
        while(times >= 1)
        {
            System.out.println(c.getRadius() + "t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times = times -1;
        }
    }
}
