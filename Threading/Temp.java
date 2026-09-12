class Shared
{
static int x,y;
synchronized static void show(String s, int a)
{
x=a;
System.out.println("Starting in method"+s+" "+x);
try
{
Thread.sleep(2000);
}catch(Exception e){ }
System.out.println("exit from method"+s+" "+x);
}

synchronized int add(int a, int b)
{
System.out.println("inside add method"+Thread.currentThread().getName());
x=a;
y=b;

try
{
Thread.sleep(2000);
}catch(Exception e){ }
return x+y;
}

void show1(String s, int a)
{
System.out.println("starting show1"+s);
try
{
Thread.sleep(2000);
}catch(Exception e){ }
System.out.println("ending show1"+s);
}

void show2(String s, int a)
{
System.out.println("starting in method"+s);
synchronized(this)
{
x=a;
System.out.println("starting in block"+s+" "+x);
try
{
Thread.sleep(2000);
}catch(Exception e){ }
System.out.println("exit from block"+s+" "+x);
}
}

Temp t=new Temp();
void show3(String s, int a)
{
System.out.println("starting in method "+s);
synchronized(t)
{
t.dilTohPagalHai(s);
}
}

synchronized void show4(String s, int a)
{
x=a;
System.out.println("starting in method"+s+" "+x);
// Thread.currentThread().suspend();
// Thread.currentThread().resume();
System.out.println("exit in method"+s+" "+x);
}
}

class Temp
{
void dilTohPagalHai(String s)
{
System.out.println("starting haa mai hoooooooooooo in dilTohPagalHai"+"  "+s);
try
{
Thread.sleep(2000);
}catch(Exception e){ }
System.out.println("ending form dilTohPagalHai");
}
}