package definingClasses_01_Intro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= countCars; count++) {
            String data = scanner.nextLine(); //"{brand} {model} {hp}"
            String brand = data.split(" ")[0];
            String model = data.split(" ")[1];
            int hp = Integer.parseInt(data.split(" ")[2]);

            Car car = new Car(); //нов празен обект
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(hp);

            System.out.println(car);

        }
    }
}
