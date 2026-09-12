import java.io.*;
class MyFileWriter
{

public static void main(String s1[])throws IOException
{
FileWriter fw=new FileWriter("appsquadz11.txt");//write mode
//FileWriter fw=new FileWriter("appsquadz11.txt",true);//append mode
//FileWriter fw=new FileWriter(new  File("e:\\f2\\appsquadz11.txt"),true);
String s="india is good country ssss";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);//fw.write(ch)or fw.write(s)
fw.close();
}
}
class MyFileReader
{

public static void main(String s1[])throws IOException
{
FileReader fr=new FileReader("appsquadz11.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
}