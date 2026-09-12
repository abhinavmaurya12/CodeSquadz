class FinalArray1{
 public static void main(String args[]){
	 
 final  int z[]={10, 20, 30};
  System.out.println(z[0]);
  z[0]=200;
  System.out.println(z[0]);
  int y[] ={100, 202, 300};
  System.out.println(y.length); // output=3;
  // z=y; // use without final
  // System.out.println(z[0]);
  }
  }