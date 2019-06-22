package ReverseWords;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static String words(String phrase) {
        String[] result = phrase.split(" ");
        Collections.reverse(Arrays.asList(result));
        return String.join(" ", result);
    }
}
