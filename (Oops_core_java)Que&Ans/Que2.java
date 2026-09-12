//2) How to call one constructor from the other constructor?
class Que2  //must be same name
{
    Que2() //must be same name
    {
        System.out.println("Default constructor");
    }

    Que2(int x)  //must be same name
    {
        this();   // calls Demo()
        System.out.println("Parameterized constructor");
    }

    public static void main(String args[])
    {
        Que2 d = new Que2(10);
    }
}

//Default constructor
//Parameterized constructor