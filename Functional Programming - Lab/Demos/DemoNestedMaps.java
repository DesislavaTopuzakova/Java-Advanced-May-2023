package FunctionalProgramming;

import java.util.*;

public class DemoNestedMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //име ученик -> учебен предмет -> лист с оценките
        Map<String, Map<String, List<Integer>>> map = new HashMap<>();

        Map<String, List<Integer>> aleksGradesMap = new HashMap<>(); //учебен предмет -> списък с оценките
        aleksGradesMap.put("BG", Arrays.asList(6, 5, 3, 2));
        aleksGradesMap.put("Math", Arrays.asList(4, 3, 4, 6));
        aleksGradesMap.put("Physics", Arrays.asList(6, 2, 6, 2));
        aleksGradesMap.put("History", Arrays.asList(4, 5,4, 5));
        map.put("Aleksandar", aleksGradesMap);

        map.get("Aleksandar").put("Geography", Arrays.asList(6, 6, 6, 6));
        map.get("Aleksandar").remove("BG");

        for (Map.Entry<String, Map<String, List<Integer>>> entry : map.entrySet()) {
            //entry
            //key -> име на ученика
            //value -> мап с предмет : списък с оценки
            String studentName = entry.getKey();
            Map<String, List<Integer>> gradesMap = entry.getValue();

            System.out.println(studentName + " has the following grades:");
            //предмет : ср. аритметично
            for (Map.Entry<String, List<Integer>> entrySubject : gradesMap.entrySet()) {
                //entrySubject
                //key -> име на предмета
                //value -> list с оценки
                String subjectName = entrySubject.getKey();
                double average = entrySubject.getValue().stream().mapToDouble(d -> d).average().orElse(0.0);
                System.out.println(subjectName + ": " + average);
            }
        }
    }
}
