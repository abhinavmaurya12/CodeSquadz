class Finally{
static int show()
{
try
{
// System.exit(0);
int x=10/0;
return 20;
}
catch(NullPointerException e){
System.out.println(e);
}
finally
{
return 40;
}
}
public static void main(String args []){
int z=show();
System.out.println(z);
//Finally f1=null;
//f1.show();
}
}