package Chapter14.Pr;

import java.util.stream.Stream;

public class Exercise14_5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa","bb","c","dddd"};

        int sum = Stream.of(strArr)
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);

    }
}
