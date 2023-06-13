package algorithms;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 2, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                if (numbers[i] > numbers[j]) {
                    //размяна
                    int tempNumber = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempNumber;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
