package generics;

public class ListCar<T extends Car>  {
    private T[] parents;

    public ListCar(T parent) {
        this.parents = (T[]) new Object[4];
    }
}
