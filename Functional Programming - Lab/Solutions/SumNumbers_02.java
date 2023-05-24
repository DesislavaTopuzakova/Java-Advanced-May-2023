package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни: "4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

        //2. брой на числата във въведения списък
        int countNumbers = numbers.size(); //брой на елементите в списъка

        //3. сума на числата в списъка
        //лист -> сума от числата
        Function<List<Integer>, Integer> sumElementsInList = list -> {
            int sum = 0; //сумата на числата в списъка
            for (int number : list) {
                sum += number;
            }

            return sum;
        };
        int sumNumbers = sumElementsInList.apply(numbers); //сума на числата в списъка

        //4. принтираме резултатите
        System.out.println("Count = " + countNumbers);
        System.out.println("Sum = " + sumNumbers);
    }
}
