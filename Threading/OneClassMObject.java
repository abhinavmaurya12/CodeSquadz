class Thread1 extends Thread
{
Thread1(String s)
{
super(s);

}
public void run()
{
for(int i=1; i<=5; i++)
{
// System.out.println(Thread.currentThread().getName());q
System.out.println("Let's go for cup of Tea..!!");
try{
Thread.sleep(1000);
}
catch(Exception e){ }
}
System.out.println(getName() + "dead");
}
}



class OneClassMObject
{
public static void main(String s[])
{

Thread1 t1=new Thread1("Thread1");
Thread2 t2=new Thread2("Thread2");
Thread3 t3=new Thread3("Thread3");

t1.start();
t2.start();
t3.start();

for(int i=1; i<=5; i++){
System.out.println(Thread.currentThread().getName());
//System.out.println("tata");
try{
Thread.sleep(1000);}
catch(Exception e){}
}
System.out.println(Thread.currentThread().getName()+"dead");

}
}