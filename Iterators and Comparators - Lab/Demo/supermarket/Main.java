package supermarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cherry");

        Stand stand = new Stand();
        stand.setFruits(fruits);
        //{"Apple", "Banana", "Orange", "Cherry"}

        Iterator<String> shopAssistant = stand.iterator();

        while (shopAssistant.hasNext()) {
            System.out.println(shopAssistant.next());
        }


    }
}
