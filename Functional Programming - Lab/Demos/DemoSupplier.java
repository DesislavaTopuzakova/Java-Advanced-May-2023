package FunctionalProgramming;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class DemoSupplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Supplier<връща> не приема нищо
        Supplier<Integer> random = () -> new Random().nextInt(51);
        System.out.println(random.get());

    }
}
