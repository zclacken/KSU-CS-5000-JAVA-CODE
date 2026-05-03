public class PrintMessageMultipleTimesVoidMethod {
    public static void main(String[] args)
    {
        //Call method to print the message Hello 5 times
        nPrintln("Hello",5);
    }

    //method to print a message n number of times
    public static void nPrintln(String message, int n)
    {
        for(int i = 0; i < n; i++)
            System.out.println(message);
    }
}
