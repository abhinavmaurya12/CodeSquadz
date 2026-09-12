class AnnonymouseArray
{
static void show(int z[]){
for(int i=0; i<z.length; i++){
System.out.println(z[i]);
}
}
public static void main(String args[]){
show(new int[]{10 , 20, 30, 40});
}
}