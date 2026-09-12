package Array_home;

import java.util.ArrayList;
import java.util.Collection;

public class Array_home22 {
    //1. loop through an arrayList
    for(int i=0; i<fruits.size(); i++)
        System.out.println(fruits.get(i)+" ");
    //apple strawberry banana

    //2. sort an arrayList
    //use sort() method
        System.out.println(fruits);//[apple, strawberry, banana]
        Collections.sort(fruits);
        System.out.println(fruits);//[apple, banana, strawberry]

    //integer sort
    ArrayList<Integer> nums=new ArrayList<>();
    nums.add(1);
    nums.add(3);
    nums.add(5);
    nums.add(-7);
    nums.add(-2);
    nums.add(10);

    System.out.println(nums);//[1,3,5,-7,-2,10]
    Collections.sort(nums);
    System.out.println(nums);//[-7,-2,1,3,5,10]



}
