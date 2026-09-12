class SharedModern
{
    static int x, y;

    synchronized static void show(String s, int a)
    {
        x = a;
        System.out.println("Starting in method " + s + " " + x);

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
        }

        System.out.println("Exit from method " + s + " " + x);
    }

    synchronized int add(int a, int b)
    {
        System.out.println("Inside add method " +
                           Thread.currentThread().getName());

        x = a;
        y = b;

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
        }

        return x + y;
    }

    void show1(String s, int a)
    {
        System.out.println("Starting show1 " + s);

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
        }

        System.out.println("Ending show1 " + s);
    }

    void show2(String s, int a)
    {
        System.out.println("Starting in method " + s);

        synchronized(this)
        {
            x = a;
            System.out.println("Starting in block " + s + " " + x);

            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
            }

            System.out.println("Exit from block " + s + " " + x);
        }
    }

    Temp t = new Temp();

    void show3(String s, int a)
    {
        System.out.println("Starting in method " + s);

        synchronized(t)
        {
            t.dilTohPagalHai(s);
        }
    }

    synchronized void show4(String s, int a)
    {
        x = a;

        System.out.println("Starting in method " + s + " " + x);

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
        }

        System.out.println("Exit in method " + s + " " + x);
    }
}


class Temp
{
    void dilTohPagalHai(String s)
    {
        System.out.println(
            "Starting haa mai hoooooooooooo in dilTohPagalHai " + s
        );

        try
        {
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
        }

        System.out.println("Ending from dilTohPagalHai");
    }
}


public class TempModern
{
    public static void main(String args[])
    {
        Shared s = new Shared();

        s.show("A", 10);

        System.out.println("Add = " + s.add(10, 20));

        s.show1("B", 30);

        s.show2("C", 40);

        s.show3("D", 50);

        s.show4("E", 60);
    }
}