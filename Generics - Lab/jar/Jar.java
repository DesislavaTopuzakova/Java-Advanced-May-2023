package jar;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> stack;
    //мястото, в което съхраняваме данните

    public Jar() {
        //нов буркан
        this.stack = new ArrayDeque<>();
    }
    public void add (T element) {
        this.stack.push(element);
    }

    public T remove() {
        return this.stack.pop();
    }

}
