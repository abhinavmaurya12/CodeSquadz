//3) What is method overriding in java?
class Parent3
{
    void show()
    {
        System.out.println("Parent");
    }
}

class Child3 extends Parent3
{
    void show()
    {
        System.out.println("Child");
    }

    public static void main(String args[])
    {
        Child3 c = new Child3();
        c.show();
    }
}


//Child