//8) What is Method Overloading in Java?

Method overloading means having multiple methods with the same name but different
 parameters in the same class.

Example:
class Demo8
{
    void add(int a, int b)
    {
        System.out.println(a + b);
    }

    void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    public static void main(String args[])
    {
        Demo d = new Demo();

        d.add(10, 20);
        d.add(10, 20, 30);
    }
}

Here, both methods have the same name add(), but their parameters are different.

👉 This is called method overloading.

Easy definition ⭐

Same method name + different parameters = Method Overloading

It is also called compile-time polymorphism.