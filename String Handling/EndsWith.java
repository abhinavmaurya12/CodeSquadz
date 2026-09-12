public class EndsWith
{
public static void main(String args[])
{
 String str = new String("This is really not immutable");
 boolean retVal;
 
 retVal =str.endsWith("immutable!!");
 System.out.println("Returned Value = " + retVal);
 
 retVal =str.endsWith("table");
 System.out.println("Returned Value = " + retVal);
 }
 }