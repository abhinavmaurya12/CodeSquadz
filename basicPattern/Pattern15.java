class Pattern15
{
public static void main(String args[]){
int n=4;
for(int i=0; i<n; i++){
for(int j=0; j<=i; j++){
System.out.print((char)('A'+i));
}
System.out.println();
}
for(int i=n-2; i>=0; i--){
for(int j=0; j<=i; j++){
System.out.print((char)('A'+i));
}
System.out.println();
}
}
}

// A
// BB
// CCC
// DDDD
// CCC
// BB
// A