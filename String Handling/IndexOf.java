public class IndexOf 
{
public static void main(String args[])
{
 String Str = new String("Welcome to Tutorials");
 String SubStr1 = new String ("Tutorials");
 String SubStr2 = new String ("Tutorials");
 
 System.out.print("Found Index : ");
 System.out.println(Str.indexOf('o')); //4
  System.out.print("Found Index : ");
 System.out.println(Str.indexOf('o' , 5)); //9
  System.out.print("Found Index : ");
 System.out.println(Str.indexOf(SubStr1));
 System.out.print("Found Index : ");
 System.out.println(Str.indexOf(SubStr1, 15));
 System.out.print("Found Index : ");
 System.out.println(Str.indexOf(SubStr2)); 
 
 }
 }
