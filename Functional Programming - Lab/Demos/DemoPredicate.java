package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        //Predicate<Integer> връща true / false  test
        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
        numbers.stream().filter(isEven);
                //true -> елементът остава в списъка
                //false -> елементът се премахва от списъка
    }
}
