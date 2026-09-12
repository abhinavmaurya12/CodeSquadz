import java.io.*;
 
 class Car implements Externalizable
{
static  int age;
	String name;
	int year;
 
	/*
	 * mandatory public no-arg constructor
	 */
	public Car() {
System.out.println("default");
}
 
	Car(String n, int y) {
	name = n;
	year = y;
age=10;
	}
 
	/**
	 * Mandatory writeExernal method.
	 */
	public void writeExternal(ObjectOutput out) throws IOException  {
System.out.println("writeExternal");
	out.writeObject(name);
	out.writeInt(year);
	out.writeInt(age);
	}
 
	/**
	 * Mandatory readExternal method.
	 */
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
System.out.println("readExternal");
	name = (String) in.readObject();
	year = in.readInt();
age = in.readInt();
	}
 
	public String toString() {
	    return ("Name: " + name + "\n" + "Year: " + year+ "\n" +"age: "+age);
	}
 
}
 
public class ExternExample_01 {
 
	public static void main(String args[])
	{
 
// create a Car object
Car car = new Car("MG Hector", 2019);
Car newCar = null;
 
//serialize the car
try {
	FileOutputStream fo = new FileOutputStream("tmp");
	ObjectOutputStream so = new ObjectOutputStream(fo);
	so.writeObject(car);
	so.flush();
} catch (Exception e) {
	System.out.println(e);
 
}
 
// de-serialize the Car
try {
	FileInputStream fi = new FileInputStream("tmp");
	ObjectInputStream si = new ObjectInputStream(fi);
	newCar = (Car) si.readObject();
}
catch (Exception e) {
	System.out.println(e);
 
}
 
 
System.out.println("The original car is ");
System.out.println(car);
System.out.println("The new car is ");
	System.out.println(newCar);
}
}

/*
1..  In this example, class Car implements Externalizable interface which means that car 
object is ready for serialization. This class has two public methods - "writeExternal" and
 "readExternal". Unlike Serializable interface which will serialize all the variables in
 the object with just by implementing the interface, here you have to explicitly mention 
 what fields or variables you want to serialize and the same is done in "writeExternal"
 and "readExternal" methods. So in the "ExternExample" class, when you write the "Car" 
 object to the OutputStream, the "writeExternal" method is called and the data is persisted. 
 The same applies to "readExternal" method in the Car object i.e., when you read the "Car" 
 object from the ObjectInputStream, "readExternal" method is called.

2. Also the information about class description is added to the stream which includes
 the descption of all the serializable superclasses, the description of the class and 
 the instance data associated with the specific instance of the class. Lots of data and 
 metadata and again performance issue.

3..  Now when an Externalizable object is reconstructed, an instance is created first using
 the public no-arg constructor, then the readExternal method is called.

4..  When an object that implements Serializable interface, is serialized or 
de-serialized, no constructor of the object is called and hence any initialization which is
 done in the constructor cannot be done.

5...  Externalization is nothing but serialization but by implementing 
Externalizable interface to persist and restore the object. To externalize 
your object, you need to implement Externalizable interface that extends Serializable 
interface. Here only the identity of the class is written in the serialization stream 
and it is the responsibility of the class to save and restore the contents of its instances
 which means you will have complete control of what to serialize and what not to serialize.
 But with serialization the identity of all the classes, its superclasses, instance variables 
 and then the contents for these items is written to the serialization stream. But to externalize 
 an object, you need a default public constructor.

6. Limitations of Serialization

1)File size is very high
2)Customization due to transient which  is not effective because we get null 
 in place of transient attributes.

7.One thing you can do with Externalization is that you can store
 extra information into object like STATIC variables and transient variables or 
 you can add more information if you...
*/