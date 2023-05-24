package FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class DemoBiFunctions {
    public static void main(String[] args) {
        //BiFunction<приема1, приема2, връща>    apply
        BiFunction<Integer, Integer, Integer> sumTwoNumbers = (firstNumber, secondNumber) -> firstNumber + secondNumber;
        int sum = sumTwoNumbers.apply(5, 6);
        System.out.println(sum);

        //BiConsumer <приема1, приема2> void     accept
        BiConsumer<String, Integer> printData = (name, age) -> System.out.println("I am " + name + ". I am " + age + " years old.");
        printData.accept("Desislava", 25);

        //BiPredicate <приема1, приема2> връща true/false    test
        BiPredicate<Integer, Integer> divisible = (firstNumber, secondNumber) -> firstNumber % secondNumber == 0;
        System.out.println(divisible.test(45, 5));
    }
}
