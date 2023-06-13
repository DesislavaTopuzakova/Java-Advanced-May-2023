package algorithms;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //F(n) = F(n-1) + F(n-2)
        System.out.println(calcFib(n));


    }

    private static long calcFib (int n) {
        //дъно
        if (n == 0) {
            //F(0)
            return 0;
        } else if (n == 1) {
            //F(1)
            return 1;
        }
        return calcFib(n - 1) + calcFib(n - 2);
    }
}
