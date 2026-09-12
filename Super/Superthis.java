class A
{
A()

{
//super() implicit super() inserted by compiler
System.out.println("A");
}
}

class B extends A
{
B(int x)
{
//super() implicit super() inserted by compiler
System.out.println(x);

}
B()
{
//super() implicit super() inserted by compiler
System.out.println("B");
}
}

class Superthis extends B
{
Superthis()
{
super(10);
// this(10);
System.out.println("Superthis");

}
Superthis(int x)
{
//super() implicit super() inserted by compiler
System.out.println(x);
}
public static void main(String args [])
{
// new Superthis();
new Superthis(12);
}

}