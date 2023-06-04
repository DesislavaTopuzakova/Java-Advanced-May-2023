package scale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        //нова везна
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        //el1.compareTo(el2)
        //result: 1, 0, -1
        //result = 0 -> el1 == el2
        //result = 1 -> el1 > el2
        //result = -1 -> el1 < el2
        if (this.left.compareTo(this.right) > 0){
            return this.left;
        }

        if (this.left.compareTo(this.right) < 0) {
            return this.right;
        }

        return null; //равни стойности

    }
}
