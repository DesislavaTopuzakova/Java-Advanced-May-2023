package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Function <приема, връщаме> -> apply

        Function<List<Integer>, Integer> sum = list -> {
            int sumNumbers = 0;
            for (int number : list) {
                sumNumbers += number;
            }

            return sumNumbers;
        };

        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 8);
        System.out.println(sum.apply(numbers));

    }
}
