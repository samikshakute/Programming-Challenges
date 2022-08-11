package week1;

import java.util.ArrayList;
import java.util.Scanner;

// Maximum pair wise product
// For example: if numbers entered are 1, 2, 3 then the answer is 6
public class MaxPairProductExample1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        int result = maximumPairWiseProduct(list, size);
        System.out.println(result);
    }

    public static int maximumPairWiseProduct(ArrayList<Integer> list, int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((list.get(i) * list.get(j)) > result) {
                    result = list.get(i) * list.get(j);
                }
            }
        }
        return result;
    }
}
// If we enter numbers in higher ranges this code will not work
// For example: for size = 2 and numbers 1000000 3000000 this code gives output: 2112827392 which is incorrect as the range of an Integer is exceeded. So instead of defining the ArrayList of type Integer we will define it as Long. Checkout the code: MaxPairProductExample2.java