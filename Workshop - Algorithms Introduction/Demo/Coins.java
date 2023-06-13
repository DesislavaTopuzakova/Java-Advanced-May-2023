package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1}; // Стойности на наличните монети
        int sumSt = Integer.parseInt(scanner.nextLine());

        int[] selectedCoins = getMinimumCoins(coins, sumSt);
        System.out.println("Най-малко количество монети: " + selectedCoins.length);
        System.out.println("Избрани монети: " + Arrays.toString(selectedCoins));
    }

    public static int[] getMinimumCoins(int[] coins, int amount) {
        Arrays.sort(coins); // Сортираме монетите във възходящ ред
        //[1, 2, 5, 10, 20, 50, 100, 200]

        int[] selectedCoins = new int[amount]; // Масив за избраните монети
        int index = 0; // Индекс в масива за избраните монети

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                selectedCoins[index] = coins[i]; // Добавяме монетата към списъка
                amount -= coins[i]; // Намаляваме сумата
                index++;
            }
        }

        return Arrays.copyOf(selectedCoins, index); // Връщаме само използваните монети
    }
}
