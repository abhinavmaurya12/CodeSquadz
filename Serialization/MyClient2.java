import java.io.*;
public class MyClient2
{
	ObjectOutputStream dout;
	public MyClient2()
	{
	try
	{

emp e1=new emp("appsquadz noida",10,5,20,100);
emp e2=new emp("lalu",13,5,20,100);
	dout=new ObjectOutputStream(new FileOutputStream("appsquadz4.txt"));
dout.writeObject(e1);
dout.writeObject(e2);
dout.flush();
		}
		catch(Exception e){System.out.println(e);}
	}


	public static void main(String ar[])
	{
		new MyClient2();
	
	}
}