import java.util.Scanner;

//Create main method
public class Pass_2D_Array_to_Method
{
    public static void main(String[] args)
    {
        int[][] table = getArray(); //call method getArray
        //Display the sum of elements
        System.out.println("\nSum of all elements is " + sum(table));
    }

//Create getArray method
public static int[][] getArray()
{
    Scanner input = new Scanner(System.in); // Create Scanner
    int[][] m = new int[3][4]; //
    System.out.println("Enter " + m.length + " rows and " +
                        m[0].length + " columns: "); //prompt
    for(int i = 0; i < m.length; i++)
        for(int j = 0; j < m[i].length; j++)
            m[i][j] = input.nextInt();
    return m;
}

//Create sum method
public static int sum(int[][] matrix)
{
    int total = 0;
    for(int row = 0; row < matrix.length; row++)
    {
        for(int column = 0; column < matrix[row].length; column++)
        {
            total = total + matrix[row][column];
        }
    }
    return total;
}
}










