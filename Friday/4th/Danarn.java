class Danarn
{
public static void main(String args[])
{
int i,j;
for(i=8; i>=1; i--){
  for(j=1; j<=8-i; j++){
	  System.out.print("  ");
  }
  
  for(j=1; j<=i; j++){
	  System.out.print(j+" ");  
  }
  
  for(j=i-1; j>=1; j--){
	  System.out.print(j+" ");
  }
  System.out.println();
}
   
   }
   }