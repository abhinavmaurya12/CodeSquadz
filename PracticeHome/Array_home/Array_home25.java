import java.util.*;
class Array_home25
{
 public static void main(String args[])
 {
  //create a manu program
  //1. add element 2. remove element 3. display element 4. exit
  
  ArrayList<Integer> integers=new ArrayList<>();
  Scanner input=new Scanner(System.in);
  
  while(true){
  displayManu();
  int choice=input.nextInt();
  
  if(choice==1){
  //add
  System.out.printf("Enter the integers: ");
  integers.add(input.nextInt());
  System.out.println("added");
  }
  else if(choice==2){
  //remove
  System.out.printf("Enter the number to remove: ");
  int elementToRemove=input.nextInt();
  if(integers.contains(elementToRemove)){
  integers.remove(new Integer(elementToRemove));
  // integers.remove(Integer.valueOf(elementToRemove));
  System.out.println("removed");
  }
  else{
  System.out.println("Element not found");
  }
  }
  else if(choice==3){
  //display
  System.out.println("Your list: " + integers);
  }
  else if(choice==4){
  //exit
  System.out.println("Good bye");
  break;
  }
  
  }
 }
  
  private static void displayManu(){
  System.out.println("***Select the options***");
  System.out.println("1. add");
  System.out.println("2. remove");
  System.out.println("3. display");
  System.out.println("4. exit");
  System.out.println();
  System.out.print("Your Choice: ");
  }
  
  
  }