//1) Static Blocks and Static Initializers in Java.
class Que1
{
    static
    {
        System.out.println("Static block");
    }

    public static void main(String args[])
    {
        System.out.println("Main method");
    }
}
//Static block
//Main method


class Que1
{
    static int x;

    static
    {
        x = 100;  // initializing x
        System.out.println("Static block executed");
    }

    public static void main(String args[])
    {
        System.out.println(x);
    }
}
//Static block executed
//100

// class Que1
// {
    // static
    // {
        // System.out.println("Block 1");
    // }

    // static
    // {
        // System.out.println("Block 2");
    // }

    // public static void main(String args[])
    // {
        // System.out.println("Main");
    // }
// }

// Block 1
// Block 2
// Main