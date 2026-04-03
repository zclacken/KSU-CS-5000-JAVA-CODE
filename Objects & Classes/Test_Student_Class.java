class Student //Create Student class
{
    //data fields below
    String name; //default value null
    int age; //default value is 0
    boolean isScienceMajor; //default value is false
    char gender; //default value is '\u0000', prints out as 00
}

class Test_Student_Class //create class 'Test' to test the student class
{
    public static void main(String[] args)//a public class is not mandatory but a main method is
    {
        Student student1 = new Student(); //creates student object
        System.out.println("name? " + student1.name);
        System.out.println("age? " + student1.age);
        System.out.println("isScienceMajor? " + student1.isScienceMajor);
        System.out.println("gender? " + student1.gender);
    }
}

