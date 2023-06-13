package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scan.nextLine());
        int index = getIndex(numbers, number);
        System.out.println(index);
    }

    public static int getIndex(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start] == key) {
                return start;
            }
            start++;
        }
        return -1;
    }
}
