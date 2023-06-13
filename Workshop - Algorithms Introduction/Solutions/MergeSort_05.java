package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sortedArray = mergeSort(Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray());

        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

    }

    private static int[] mergeSort(int[] array) {

        if (array.length == 1) {
            return array;
        }
        int halfIndex = array.length / 2;
        int[] firstPartition = Arrays.copyOfRange(array, 0, halfIndex);
        int[] secondPartition = Arrays.copyOfRange(array, halfIndex, array.length);

        firstPartition = mergeSort(firstPartition);
        secondPartition = mergeSort(secondPartition);

        return mergeTwoSortedArrays(firstPartition, secondPartition);
    }

    private static int[] mergeTwoSortedArrays(int[] firstPartition, int[] secondPartition) {
        int[] sorted = new int[firstPartition.length + secondPartition.length];
        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstPartition.length && secondIndex < secondPartition.length) {
            if (firstPartition[firstIndex] < secondPartition[secondIndex]) {
                sorted[firstIndex + secondIndex] = firstPartition[firstIndex];
                firstIndex++;
            } else {
                sorted[secondIndex + firstIndex] = secondPartition[secondIndex];
                secondIndex++;
            }
        }

        while (firstIndex < firstPartition.length) {

            sorted[firstIndex + secondIndex] = firstPartition[firstIndex];
            firstIndex++;
        }

        while (secondIndex < secondPartition.length) {
            sorted[secondIndex + firstIndex] = secondPartition[secondIndex];
            secondIndex++;

        }

        return sorted;
    }
}

