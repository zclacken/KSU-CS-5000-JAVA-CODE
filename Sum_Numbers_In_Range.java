//calculate the sum of all numbers from 10 to 15 inclusive

public class Sum_Numbers_In_Range
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i= 10; i <= 15; i++)
            sum = sum + i;
        System.out.println(sum);

    }
}
