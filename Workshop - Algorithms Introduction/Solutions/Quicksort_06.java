package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Quicksort_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array).replaceAll("[\\[\\],]", ""));
    }

    static void sort(int[] subArray, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            int pivot = partition(subArray, startIndex, endIndex);
            sort(subArray, startIndex, pivot - 1);
            sort(subArray, pivot + 1, endIndex);
        }
    }

    static int partition(int[] subArray, int startIndex, int endIndex) {

        int pivot = subArray[endIndex];
        int i = (startIndex - 1);

        for (int j = startIndex; j < endIndex; j++) {
            if (subArray[j] <= pivot) {
                i++;
                int temp = subArray[i];
                subArray[i] = subArray[j];
                subArray[j] = temp;
            }
        }
        int temp = subArray[i + 1];
        subArray[i + 1] = subArray[endIndex];
        subArray[endIndex] = temp;
        return i + 1;
    }
}
