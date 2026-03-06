//Main method: define and print result
//Sum method: create loop or calculation to sum numbers  

public class Sum_Method
{
    //main method
    public static void main(String[] args)
    {
        int result = sum(1,10);
        System.out.println("Sum from 1 to 10 is: " + result);
        result = sum(20,30);
        System.out.println("Sum from 20 to 30 is: " + result);
        result = sum(35,45);
        System.out.println("Sum from 35 to 45 is: " + result);
    }

    //Sum Method: calculate the sum of the variables specified above
    public static int sum (int num1, int num2)
    {
        int sum = 0;
        for (int i = num1; i <= num2; i++)
            sum = sum + i;
        return sum;
    }
}
