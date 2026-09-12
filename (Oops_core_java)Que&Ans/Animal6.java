//6) Difference between Abstract Class and Interface??

abstract class Animal6
{
    abstract void sound();

    void eat()
    {
        System.out.println("Eating");
    }
}


interface Animal6
{
    void sound();
}


// Abstract class: Used when classes have some common code + some incomplete methods.
// Interface: Used mainly to define a common contract/rules that implementing classes must follow.