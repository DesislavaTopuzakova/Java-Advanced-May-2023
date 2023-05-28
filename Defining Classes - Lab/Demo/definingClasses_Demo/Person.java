package definingClasses_Demo;

public class Person {
    //полета
    private String name;
    private int age;
    private String birthday;


    //методи
    //1. конструктор
    public Person(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //2. getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    //3. setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public int hashCode() {
        return 1234;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public String toString() {
        return "test";
    }
}
