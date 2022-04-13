package com.samiksha;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPairWiseProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>(10);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(in.nextLong());
        }
        long result = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ((long) list.get(i) * list.get(j) > result) {
                    result = (long) list.get(i) * list.get(j);
                }
            }
        }
        System.out.println(result);
    }
}
