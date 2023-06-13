package algorithms;

import java.util.Scanner;

public class RecursiveFactorial_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = Integer.parseInt(scanner.nextLine());

        //n! -> факториел от n
        //n = 5 -> 5! = 5 * 4 * 3 * 2 * 1
        //5! = 5 * 4!
        //4! = 4 * 3!
        //3! = 3 * 2!
        //2! = 2 * 1!

        //0! = 1
        //1! = 1

        System.out.println(calcFact(n));

    }

    public static long calcFact (int n) {
        //1! = 1
        //0! = 1

        //дъно
        if (n == 1 || n == 0) {
            return 1;
        }

        return n * calcFact(n - 1);
    }
}
