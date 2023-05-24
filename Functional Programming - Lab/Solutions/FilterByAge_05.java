package com.softuni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> people = new LinkedHashMap<>();

        int peopleCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < peopleCount; i++) {
            String[] personData = scanner.nextLine().split(", ");
            String personName = personData[0];
            int personAge = Integer.parseInt(personData[1]);
            people.put(personName, personAge);
        }

        String comparison = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String printType = scanner.nextLine();

        //филтрира според възрастов лимит
        //Predicate<T>
        //BiPredicate<R, T>
        BiPredicate<Integer, Integer> filterPredicate;
        if (comparison.equals("younger")) {
            filterPredicate = (personAge, age) -> personAge <= age;
        } else {
            filterPredicate = (personAge, age) -> personAge >= age;
        }

        //принтира според шаблона
        //Consumer
        Consumer<Map.Entry<String, Integer>> printConsumer;
        if(printType.equals("age")){
            printConsumer = person -> System.out.println(person.getValue());
        } else if(printType.equals("name")){
            printConsumer = person -> System.out.println(person.getKey());
        } else {
            printConsumer = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
        }

        people.entrySet()
                .stream()
                .filter(person -> filterPredicate.test(person.getValue(), ageLimit))
                .forEach(printConsumer);


    }
}