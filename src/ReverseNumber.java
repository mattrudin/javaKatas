public class ReverseNumber {
    public static int reverse(int number) {
        int result;
        if (number < 0) {
            result = reverseNumber(number * (-1));
            return result * (-1);
        } else {
            result = reverseNumber(number);
            return result;
        }
    }

    private static int reverseNumber(int number) {
        String string = String.valueOf(number);
        char[] array = string.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return Integer.parseInt(result);
    }
}