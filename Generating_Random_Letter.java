//to set a letter as a number for use with Math.random(), use single quotation marks

public class Generating_Random_Letter
{
    public static void main(String[] args)
    {
        //generate a random lowercase letter between a and z
        //enter 'A' and 'Z' for capital letters

        int lowerlimit = 'a';
        int upperlimit = 'z';

        char randomcharacter = (char)(lowerlimit + Math.random() * (upperlimit - lowerlimit + 1));

        System.out.println(randomcharacter);
    }
}
