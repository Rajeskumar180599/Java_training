import java.util.HashMap;
import java.util.Map;

public class testing_potion {

    public static void main(String[] args) {

        int target = 24;

        System.out.println("Pairs of integers that multiply to " + target + ":");
        for (int i = 1; i <= 100; i++) {
            if (target % i == 0) {
                int pair = target / i;
                System.out.println(i + " * " + pair + " = " + target);
                System.out.println(-i + " * " + -pair + " = " + target);
            }
        }
    }
}






