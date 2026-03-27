public class Manually_Populate_2D_Matrix
{
    public static void main(String[] args)
    {
       int [][] array = {
               {1,2,3},
               {4,5,6},
               {7,8,9},
               {10,11,12}
       };

       //Print the Matrix
        for(int i = 0; i < 4; i++) //process rows
        {
            for (int j = 0; j < 3; j++) //process columns
                System.out.print(" " + array[i][j]); //print elements
            System.out.println();//prints matrix in a table format
        }
    }
}
