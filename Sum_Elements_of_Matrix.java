//How to sum all, by column, and by row

public class Sum_Elements_of_Matrix
{
    public static void main(String[] args)
    {
        //Create the matrix
        int [][] array2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int totalAll = 0; //start counting from the values of column 1

        //Sum every element in the matrix
        for (int row = 0; row < array2.length; row++)
        {
            for (int column = 0; column < array2[row].length; column++)
            {
                totalAll = totalAll + array2[row][column];
            }
        }
        System.out.println("The sum total of all elements is " + totalAll);

        //Sum elements by column
        //Prints the sum of each column individually
        for(int column = 0; column < array2[0].length; column++)
        {
            int columnTotal = 0;//resets columnTotal so each column gets its own sum
            for(int row = 0; row < array2.length; row++)
                columnTotal = columnTotal + array2[row][column];

            //prints out the sum for each column - index starts at 0
            System.out.println("Sum for column " + column + " is " + columnTotal);
        }

        //Sum elements by row
        //Prints the sum of each row individually
        for(int row = 0; row < array2.length; row++)
        {
            int rowTotal = 0; //resets rowTotal so each row gets its own sum
            for(int column = 0; column < array2[row].length; column++)
                rowTotal = rowTotal + array2[row][column];
            //prints out the sum for each column - index starts at 0
            System.out.println("Sum for row " + row + " is " + rowTotal);
        }
    }
}


