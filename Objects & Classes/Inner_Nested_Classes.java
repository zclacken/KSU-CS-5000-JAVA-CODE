//Program with an Inner (Nested) Class

//Create OuterClass
class OuterClass
{
    public void OuterMethod() //create method for outer class
    {
        System.out.println("I am in the outer class method");
    }

    class InnerClass //Create Inner Class
    {
        public void InnerMethod() //create method for inner class
        {
            System.out.println("I am in the inner class method");
        }
    }
}

class Driver //Driver class to test the inner and outer classes
{
    public static void main(String[] args)
    {
        //outer class object
        OuterClass outerObject = new OuterClass();
        outerObject.OuterMethod(); //method call

        //inner class object
        OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
        innerObject.InnerMethod();; //method call
    }
}

