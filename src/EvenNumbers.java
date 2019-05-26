import java.util.Arrays;
import java.util.LinkedList;

public class EvenNumbers {

    // Method with LinkedList and stream
    public static int[] divisibleBy(int[] numbers, int divider) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int number : numbers) {
            if(number % divider == 0) {
                list.add(number);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Method with stream only
    public static int[] divisibleByAlternative(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> i % divider == 0).toArray();
    }
}
