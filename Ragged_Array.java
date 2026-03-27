//Rows in a matrix can have different lengths
//This is because each row in a 2d array is itself an array

public class Ragged_Array
{
    public static void main(String[] args)
    {
        int [][] raggedarray = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        //Print a ragged array
        for(int i = 0; i < raggedarray.length; i++) //process rows
        {
            for (int j = 0; j < raggedarray[i].length; j++) //process columns
                System.out.print(" " + raggedarray[i][j]); //print elements
            System.out.println();//prints matrix in a table format
        }
    }
}
