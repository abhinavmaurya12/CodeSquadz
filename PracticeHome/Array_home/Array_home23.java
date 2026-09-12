package Array_home;

public class Array_home23 {
    //for each loop

    // for(TYPE VAR_NAME : ArrayList/Array){
   //     ....
   //  }

    ArrayList<String> itemArrayList=new ArrayList<>();
    itemArrayList.add("item1");
    itemArrayList.add("item2");
    itemArrayList.add("item3");

    String[] itemArray={"item1", "item2", "item3"};

    for(String item : itemArrayList )
        System.out.println(item+" ");


    int arr[]={5,2,3,4};
    int i=0;
    for(int item : arr)
        System.out.println(item + " " + i);
        i++;
    // 5  0
    // 2  1
    // 3  2
    // 4  3

}
