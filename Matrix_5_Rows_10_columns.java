//Create a matrix with 5 rows and 10 columns

public class Matrix_5_Rows_10_columns
{
    public static void main(String[] args)
    {
        //declare matrix
        //each [] represents a dimension
        //left is row count; right is column count
      int [][] grades = new int[5][10];

        //Define formula for populating the matrix
      for(int i = 0; i < grades.length; i++) //define row values
          for(int j = 0; j < grades[i].length; j++) //define column values
              grades[i][j] = (int)(Math.random() * 100); //define elements

        //Populate the matrix and print
      for(int i = 0; i < 5; i++) //process rows
      {
          for (int j = 0; j < 10; j++) //process columns
              System.out.print(" " + grades[i][j]); //print elements
          System.out.println();//prints matrix in a table format
      }
    }
}
