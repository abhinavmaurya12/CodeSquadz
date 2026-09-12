class Animals // Practice2 inheritance
{
String color;

void eat(){
System.out.println("Animals eat");
}

void breath(){
System.out.println("Animals breath form nose");
}
}

class Fish extends Animals{
int fins;

void swim(){
System.out.println("swiming");
}

// preority allways goes to local
// void eat(){  
// System.out.println("Shark eat");
// }

public static void main(String args[]){
Fish Shark = new Fish();
Shark.eat();
Shark.swim();
// Shark.breath();
}
}