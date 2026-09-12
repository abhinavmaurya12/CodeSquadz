//4) What is super keyword in java?
class Parent_super4
{
    int x = 10;
}

class Child_super4 extends Parent_super4
{
    int x = 20;

    void show()
    {
        System.out.println(super.x);
    }

    public static void main(String args[])
    {
        Child_super4 c = new Child_super4();
        c.show();
    }
}