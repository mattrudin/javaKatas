import java.util.Arrays;

class Find {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        if(numbers[0] == numbers[1]) {
            int length = numbers.length;
            return numbers[length - 1];
        } else {
            return numbers[0];
        }
    }
}