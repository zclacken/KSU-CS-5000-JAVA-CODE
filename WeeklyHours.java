public class WeeklyHours
{
    public static void main(String[] args)
    {
        String[] colTitles = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        String[] rowTitles = {"Employee1", "Employee2","Employee3"};
        int [][] workHours = new int [3][7];

        //Populate the table with random numbers
        for(int i = 0; i < workHours.length; i++)
            for(int j = 0; j < workHours[i].length; j++)
                workHours[i][j] = (int)(Math.random() * 11);//generates integers between 0 and 10

        //Print column titles
        System.out.printf("%-12s",""); //spacing for row titles
        for(int j = 0; j < colTitles.length; j++)
        {
            System.out.printf("%-6s", colTitles[j]); //print column titles and space between titles
        }
        System.out.println(); //space to start Employee1 on next line

        //Print row titles
        for(int i = 0; i < workHours.length; i++)
        {
            System.out.print(rowTitles[i] + "\t ");
            for(int j = 0; j < workHours[i].length; j++)
            {
                System.out.printf("%-6s", workHours[i][j]);
            }
            System.out.println(); //move to the next line
        }

    }
}
