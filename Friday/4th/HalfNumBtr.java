class HalfNumBtr
{
public static void main(String args[])
{
int i,j;
for(i=1; i<=8; i++){
 for(j=1; j<=i; j++){
  System.out.print(j);
  }
  for(j=1; j<=16-(2*i); j++){
	  System.out.print(" ");
  }
  
  if(i==8){
  for(j=i-1; j>=1; j--){
	  System.out.print(j);
  }}
  else{
	  for(j=i; j>=1; j--){
	  System.out.print(j);
  }}
  System.out.println();
  }
  }
  }