package zoo;

import java.util.Iterator;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    //cat1.compareTo(cat2)
    public int compareTo(Cat cat2) {
        //0 -> ако двете котки са с еднаква възраст
        //> 0 -> първата е по-възрастна от втората
        // < 0 -> втората е по- възрастна от първата
        if (this.age == cat2.age) {
            return 0;
        } else if (this.age > cat2.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
