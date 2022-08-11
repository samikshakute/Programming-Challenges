package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxPairProductExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Long> list = new ArrayList<>(10);
        for(int i=0; i<size; i++) {
            list.add(in.nextLong());
        }
        long result = maximumPairWiseProduct(list, size);
        System.out.println(result);
    }
    public static long maximumPairWiseProduct(ArrayList<Long> list, int size) {
        long result = 0;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(list.get(i) * list.get(j) > result) {
                    result = list.get(i) * list.get(j);
                }
            }
        }
        return result;
    }
}
// This solution consumes a lot of space as we are going through all the possible pairs of numbers. So we need a faster algorithm to solve this problem. Here the compexity is n square. Checkout MaxPairProductExample3 for optimized solution.