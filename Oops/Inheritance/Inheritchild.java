class Inheritance  // example:- movies , cars, mobile company.
{
    private int x = 10;

    void show()
    {
        System.out.println(x);
    }
}

class Inheritchild extends Inheritance // always use child name as a file name in case of
                                     // main inside child class
{
    public static void main(String args[])
    {
        Inheritchild ch = new  Inheritchild();
        ch.show();
		// ch.x; ---> we can not use / call direct x <---
    }
}

