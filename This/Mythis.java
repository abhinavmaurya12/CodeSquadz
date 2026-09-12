class Mythis 
{
int x=100;
void get(Mythis this, int x)
{
System.out.println(this+"get");
System.out.println(this.x);
System.out.println(x);
this.show();
}

void show()
{
System.out.println("show");
}

public static void main(String args[])
{
Mythis mt= new Mythis();
System.out.println(mt+"main");
mt.get(300);
}
}
