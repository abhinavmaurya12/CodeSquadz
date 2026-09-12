class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Geeks {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    }
}