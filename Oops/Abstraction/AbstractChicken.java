abstract class Bird
{
int x;
int y;
void count() // use always '()' after void xyz() { }
{
System.out.println(x); 
System.out.println(y);
}

abstract void fly(); 
}

class AbstractChicken extends Bird
{

// con() ka kaam x aur y ki value set karna hai
void con(int x, int y) // this.x = x; sirf constructor ya method 
                       //   ke andar likh sakte ho.
{                     // con() koi class nahi hai balki method hai 
this.x=x;
this.y=y;
}

void fly() // not use ';' after fly()  
{
	System.out.println("Chicken cannot fly"); // not imp. it's on you..
}

public static void main(String args[])
{
AbstractChicken cf=new AbstractChicken();
cf.fly();
 
cf.con(10,20); // method call
cf.count(); // print after method call
}
}
