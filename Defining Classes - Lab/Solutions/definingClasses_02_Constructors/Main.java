package definingClasses_02_Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int carCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= carCount; i++) {
            String[] carParts = scanner.nextLine().split(" ");
            Car currentCar = new Car();

            if (carParts.length == 3) {
                currentCar = new Car(
                        carParts[0], carParts[1], Integer.parseInt(carParts[2]));
            } else {
                currentCar = new Car(carParts[0]);
            }

            System.out.println(currentCar.toString());
        }
    }
}
