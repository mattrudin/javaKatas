package OddCountKata;

import java.util.Arrays;

public class Odd {
    private static int[] numbers;

    public static int count(int threshold) {
        fillCollection(threshold);
        return (int) Arrays.stream(numbers).filter(num -> num % 2 == 1).count();
    }

    private static void fillCollection(int threshold) {
        numbers = new int[threshold];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }
}
