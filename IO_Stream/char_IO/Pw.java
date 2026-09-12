import java.io.*;
class Pw
{
public static void main(String s[])throws IOException
{

PrintWriter pw=new PrintWriter(new FileWriter("abc1.txt"));
pw.println("hello");
pw.println("hay");
pw.close();
System.out.println("File created");
}
}

//PrintWriter(Writer  t);