package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers_Functional_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни само четните числа -> "4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
        List<Integer> numbers = Arrays.stream(scanner.nextLine() //"4, 2, 1, 3, 5, 7, 1, 4, 2, 12"
                                .split(", ")) //["4", "2", "1", "3", "5", "7", "2", "4", "2", "12"]
                                .map(Integer::parseInt) //[4, 2, 1, 3, 5, 7, 2, 4, 2, 12]
                                .filter(n -> n % 2 == 0) //[4, 2, 2, 4, 2, 12]
                                .collect(Collectors.toList()); //{4, 2, 2, 4, 2, 12}

        //2. принтирам само четните числа
        //System.out.println(String.join(", ", numbers.toString() .replace("[","") .replace("]","")));
        printListWithComa(numbers);
        //3. сортираме в нарастващ ред
        Collections.sort(numbers);
        //4. принтираме отново само четните числа
        //System.out.println(String.join(", ", numbers.toString().replace("[","").replace("]","")));
        printListWithComa(numbers);
    }

    private static void printListWithComa(List<Integer> numbers) {
        //{4, 2, 2, 4, 2, 12}
        List<String> numbersAsText = new ArrayList<>();
        for (int number : numbers) {
            //4 -> "4"
            numbersAsText.add(String.valueOf(number));
        }
        //{"4", "2", "2", "4", "2", "12"}
        System.out.println(String.join(", ", numbersAsText));
    }
}
