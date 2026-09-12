class HashDia
{
public static void main(String args[])
{
int i,j,k;
//upper
 for(k=1; k<=6; k++){
   System.out.print("  ");
   }
  for(i=1; i<=11; i++){
	  System.out.print("# ");
   }
   System.out.println();
   
   //mid1
 for(i=1; i<=5; i++){
  for(k=1; k<=11-i; k++){
   System.out.print("  ");
   }
  for(j=0; j<=2*i-1+1; j++){
  System.out.print("# ");
  } 
   System.out.println();
   }
   
  //mid2
  for(i=4; i>=1; i--){
  for(k=1; k<=11-i; k++){
   System.out.print("  ");
   }
  for(j=0; j<=2*i-1+1; j++){
  System.out.print("# ");
  } 
  System.out.println();
  }
  
  //last
  for(k=1; k<=6; k++){
   System.out.print("  ");
   }
  for(i=1; i<=11; i++){
	  System.out.print("# ");
   }
}
   }