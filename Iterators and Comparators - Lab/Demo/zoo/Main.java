package zoo;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Nikolay", 12, 7500);
        Cat cat2 = new Cat("Sami", 3, 3400);

        System.out.println(cat1.compareTo(cat2));
        //0 -> котките са с еднаква възраст
        //1 -> Николай е по-стар
        //-1 -> Сами е по-стар

    }
}
