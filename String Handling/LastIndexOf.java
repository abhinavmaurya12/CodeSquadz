public class LastIndexOf 
{
public static void main(String args[])
{
 String Str = new String("Welcome to Tutorials");
 String SubStr1 = new String ("Tutorials");
 String SubStr2 = new String ("Tutorials");
 
 System.out.print("Found Last Index : ");
 System.out.println(Str.lastIndexOf('o')); //14
  System.out.print("Found Last Index : ");
 System.out.println(Str.lastIndexOf('o' , 10)); //9
  System.out.print("Found Last Index : ");
 System.out.println(Str.lastIndexOf(SubStr1));
 System.out.print("Found Last Index : ");
 System.out.println(Str.lastIndexOf(SubStr1, 15));
 System.out.print("Found Last Index : ");
 System.out.println(Str.lastIndexOf(SubStr2)); 
 
 }
 }
