package FunctionalProgramming;

import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        //Consumer<приема> -> void -> accept
        Consumer<String> print = text -> {
            text += "Test";
            System.out.println(text + "!");
            System.out.println(text + "?");
            System.out.println(text + ".");
        };

        print.accept("Today is Tuesday");
    }


}
