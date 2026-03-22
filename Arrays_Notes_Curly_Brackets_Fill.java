//Build an array by entering the elements within curly brackets

public class Arrays_Notes_Curly_Brackets_Fill
{
    public static void main(String[] args)
    {
        //Create an array called myNumbers with 5 integer elements
       int[] myNumbers = {100,200,300,400,500};

       //Create an array called myLetters with 5 letter elements
        char[] myLetters = {'A', 'B', 'C', 'D', 'E'};

        //Define and check the length of the array myNumbers
        int numbersLength = myNumbers.length;
        System.out.println("myNumbers length " + "= " + numbersLength);

        //Define and check the length of the array myLetters
        int lettersLength = myLetters.length;
        System.out.println("myLetters length" + "= " + lettersLength);

        //blank space
        System.out.println();

        //indices range equals 0 to (array length - 1)
        //reference the first element in the array: myList[0]
        System.out.println("first element of myNumbers is " + myNumbers[0]);
        //reference the final element in the array: myList[9]
        System.out.println("final element of myNumbers is " + myNumbers[4]);

        //blank space
        System.out.println();

        //print content of myNumbers and values of its index numbers
        for(int i = 0; i < numbersLength; i++)
            System.out.println("myNumbers Index " + i + " = " + myNumbers[i]);

        System.out.println(); //blank space

        //print content of myLetters and values of its index numbers
        for(int i = 0; i < lettersLength; i++)
            System.out.println("myLetters Index " + i + " = " + myLetters[i]);
    }
}
