import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_home24 {
    public static void main(String args[]) {

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter the 5 nums:");

        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 5; j++) {
            int temp = input.nextInt();

            if (!integers.contains(temp)) {
                integers.add(temp);
            }
        }

        Collections.sort(integers);

        System.out.println(integers);

        // input.close();
    }
}