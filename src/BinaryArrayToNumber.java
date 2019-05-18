import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        Collections.reverse(binary);
        int result = 0;
        int base = 1;

        for (Integer integer : binary) {
            result += integer * base;
            base *= 2;
        }
        return result;
    }
}
