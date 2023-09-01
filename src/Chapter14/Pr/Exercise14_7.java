package Chapter14.Pr;

import java.util.Random;
import java.util.stream.Stream;

public class Exercise14_7 {
    public static void main(String[] args) {
        new Random().ints(1,46)
                .limit(6)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
