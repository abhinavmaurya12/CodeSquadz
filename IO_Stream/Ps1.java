import java.io.*;
class Ps1
{

public static void main(String s[])throws IOException
{
FileOutputStream fout=new FileOutputStream("pss.txt");
PrintStream ps=new PrintStream(fout);
ps.println("hello");
ps.println("hay");
System.out.println("file created");
}
}