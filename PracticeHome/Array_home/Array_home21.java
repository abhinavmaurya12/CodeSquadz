package Array_home;

public class Array_home21 {
	public static void main(String args[])
	{
    //arrayList.. learn

    //1. a resizable array
    ArrayList<Integer> integer; //null
    integer=new ArrayList<>();

    ArrayList<Integer> integers=new ArrayList<>();
    ArrayList<String> fruits=new ArrayList<>();
    ArrayList<Double> doubles=new ArrayList<>();
    //we can store obj(String,Integer,Boolean,Character....) not
    //a primitive type(int, char, boolean, double.....)

    //2. add a elements/items
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("strawberry");
    System.out.println(fruits);//[apple, banana, strawberry]

    fruits.add(0,"atIndex 0");
    System.out.println(fruits);//[atIndex 0,apple, banana, strawberry]

    fruits.add(2,"atIndex 2");
    System.out.println(fruits);//[atIndex 0,apple,atIndex 2, banana, strawberry]

    //3. access the items
    // get() method
    System.out.println(fruits.get(0));//apple
    System.out.println(fruits.get(1));//banana
    System.out.println(fruits.get(2));//strawberry

    //4. change the item in arrayList
    //use set() method
    fruits.set(2, "orange");//strawberry to orange
    System.out.println(fruits);//[apple, banana, orange]

    //5. remove elements
    //remove by index:
    fruits.remove(1);//remove element at index 1
    System.out.println(fruits);//[apple, orange] //banana

    //remove by value
    fruits.remove("banana");//remove element name banana at any index
    System.out.println(fruits);//[apple, orange] //banana

    //remove all elements clear() method
    fruits.clear();//remove all elements
    System.out.println(fruits);//[ ]

    //size of arrayList
    System.out.println(fruits.size()); //3
    fruits.remove("banana");
    System.out.println(fruits.size()); //2
    fruits.add("orange");
    System.out.println(fruits.size()); //3
    fruits.clear();
    System.out.println(fruits.size()); //0

	}

}
