package scale;


public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(5, 9);
        System.out.println(scale.getHeavier());

    }
}
