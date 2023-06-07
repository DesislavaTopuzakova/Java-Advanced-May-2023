package supermarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stand implements Iterable<String> {
    private List<String> fruits;

    public Stand() {
        //нов празен щанд
        this.fruits = new ArrayList<>();
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    @Override
    public Iterator<String> iterator() {
        return new ShopAssistant();
    }

    //ITERATOR -> инструментът, който обхожда чрез методите hasNext, next
    private class ShopAssistant  implements Iterator<String> {
        //iterator -> инструментът, който ще обхожда
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < fruits.size();
        }

        @Override
        public String next() {
            return fruits.get(index++);
        }
    }
}
