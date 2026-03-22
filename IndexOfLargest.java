//CS 5000
//Spring 2026
//Zara Clacken
//Dr. Haddad
//Assignment 6
//Program #2
//IDE: IntelliJ

public class IndexOfLargest
{
    public static int findIndex(int[] arr)
    {
       int max = arr[0];
       int index = 0;

       for(int i =1; i < arr.length; i++)
       {
           if(arr[i] > max)
           {
               max = arr[i];
               index = i;
           }
       }
       return index;
    }
}
