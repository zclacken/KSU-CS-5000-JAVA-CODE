public class EvenOddVoidMethod
{
    public static void main(String[] args)
    {
        int n = 20; 

        Even_Odd(n);
    }

    public static void Even_Odd(int n)
    {
        if((n%2)==0)
            System.out.println(n + " is Even.");
        else
            System.out.println(n + " is Odd.");
    }
}
