abstract class Bird
{
int x;
int y;
void show()
{
System.out.println(x);
System.out.println(y);
}

abstract void display();

}

class MyRegister
{
	void register(Bird b)
	{
		b.display();
	}
}

class AbstractChild extends Bird
{
void get(int x, int y)
{
this.x=x;
this.y=y;
}

void display()
{
System.out.println("display");
}

public static void main(String args[]){
AbstractChild ac = new AbstractChild();
// ac.display();

MyRegister mr = new MyRegister();
mr.register(ac);

// ac.get(10,20);
// ac.show();
}
}
