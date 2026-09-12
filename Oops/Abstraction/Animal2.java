abstract class Animal // abstraction hide the all un-necessary details..
{
	
void eat(){
System.out.println("animal eats");
}

abstract void walk();
}

class horse extends Animal
{
void walk(){
System.out.println("walk on 4 legs");
}
}

class chicken extends Animal
{
void walk(){
System.out.println("walk on 2 legs");
}
}

class Animal2 //psvm always inside any class without class it's can't run...
{
public static void main(String args[]){
horse h = new horse();
h.eat();
h.walk();
 
chicken c = new chicken();
c.eat();
c.walk();
}
}
