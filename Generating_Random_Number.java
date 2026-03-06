//syntax for generating random value: lower limit + Math.random() * upper limit addon
//the upper limit addon is the number added to the lower limit to set the upper limit
//e.g., if the upper limit addon is 10, and lower limit is 5, the generation will only go up to 14.9999
//this is because 5 + 10 equals 15
//thus, numbers between 5.0 and 14.9999... will be generated
//to include 15, the addon must be set to 11, since 5 + 11 = 16
//to specify integer generation: (int)(Math.random()* upperlimit_addon)

public class Generating_Random_Number
{
    public static void main(String[] args)

    {
        int lowerlimit_inclusive,upperlimit_addon;

        lowerlimit_inclusive = 5;
        upperlimit_addon = 10; //
        double randomnumber = lowerlimit_inclusive + Math.random() * upperlimit_addon;

        System.out.println(randomnumber);
    }
}