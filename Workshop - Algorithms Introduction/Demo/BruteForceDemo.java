package algorithms;

public class BruteForceDemo {
    public static void main(String[] args) {
        //{0-9}{0-9}{0-9}{0-9}{0-9}
        int count = 0; //брой опити
        for (int first = 0; first <= 9; first++) {
            for (int second = 0; second <= 9; second++) {
                for (int third = 0; third <= 9; third++) {
                    for (int forth = 0; forth <= 9; forth++) {
                        for (int fifth = 0; fifth <= 9; fifth++) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}
