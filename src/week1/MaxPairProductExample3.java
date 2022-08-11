package week1;

import java.util.Scanner;

public class MaxPairProductExample3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();
        }
        long result = maximumPairWiseProduct(numbers);
        System.out.println(result);
    }

    public static long maximumPairWiseProduct(int[] numbers) {
        int size = numbers.length;
        int max_index1 = -1;
        for (int i = 0; i < size; i++) {
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1])) {
                max_index1 = i;
            }
        }
        int max_index2 = -1;
        for (int j = 0; j < size; j++) {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2]))) {
                max_index2 = j;
            }
        }
        return ((long) (numbers[max_index1])) * numbers[max_index2];
    }
}
// In this program, we found the 2 maximum numbers index from the list and returned its product as in maximum pair wise product the product of two maximum numbers is calculated. For example if size = 5 and numbers are 3 2 9 4 6 then the output is 54 which is the product of 9 and 6 which are the maximum numbers in the list.