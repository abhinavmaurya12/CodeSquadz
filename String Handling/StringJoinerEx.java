import java.util.StringJoiner;
class StringJoinerEx
{
public static void main(String args[])
{
// StringJoiner sj= new StringJoiner(",");
StringJoiner sj= new StringJoiner("@","(",")"); // adding prefix and suffix
sj.add("Lallu");
sj.add("Kumar");
sj.add("Yadav");
System.out.println(sj);
}
}