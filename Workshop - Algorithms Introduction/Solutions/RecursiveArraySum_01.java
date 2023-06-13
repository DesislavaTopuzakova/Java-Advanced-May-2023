package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        //3 4 5 6 8 9
        System.out.println(sumArray(array, 0));
    }

    public static int sumArray(int [] array, int index) {
        if (index >= array.length) {
            return 0;
        }

        return array[index] + sumArray(array, index + 1);

    }
}
