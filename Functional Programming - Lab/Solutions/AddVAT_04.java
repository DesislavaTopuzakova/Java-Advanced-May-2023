package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни: списък с дробни числа
        List<Double> prices = Arrays.stream(scanner.nextLine()
                        .split(", "))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());

        //цена -> върна цена + 20%
        Function<Double, Double> addVAT = price -> price * 1.2;
        //цена с ДДС -> отпечатвам
        Consumer<Double> printFormatPrice = price -> System.out.printf("%.2f%n", price);

        System.out.println("Prices with VAT:");
        for (double price : prices) {
            double priceWithVAT = addVAT.apply(price); //цена след добавено ДДС
            printFormatPrice.accept(priceWithVAT);
        }
    }
}
