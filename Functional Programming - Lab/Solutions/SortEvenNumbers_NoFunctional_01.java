package FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers_NoFunctional_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> "4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
        String input = scanner.nextLine(); //"4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
        String[] splittedInput = input.split(", "); //["4", "2", "1", "3", "5", "7", "2", "4", "2", "12"]

        List<Integer> numbers = new ArrayList<>();
        for (String text : splittedInput) {
            numbers.add(Integer.parseInt(text));
        }

        //2. принтирам само четните числа
        printOnlyEvenNumbers(numbers);

        //3. сортираме в нарастващ ред
        Collections.sort(numbers);


        //4. принтираме отново само четните числа
        System.out.println();
        printOnlyEvenNumbers(numbers);
    }

    private static void printOnlyEvenNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
