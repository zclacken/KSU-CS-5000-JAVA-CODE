//Build an array by filling in the index numbers of each element

public class Arrays_Notes_Index_Number_Fill
{
    public static void main (String[] args)
    {
        //Define the length of the array
        int[] myList = new int[4];
        //input the elements of the array respective to index number
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 3;
        myList[3] = 4;

        //print out the array
        for(int i = 0; i < myList.length; i++)
            System.out.println(myList[i]);

    }
}
