import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        String concatenated = s1 + s2;
        String sorted = sortString(concatenated);
        String result = uniqueChars(sorted);
        return result;
    }

    private static String sortString(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    private static String uniqueChars(String string) {
        StringBuilder result = new StringBuilder();
        Set<Character> tempHashSet = new LinkedHashSet<>();

        for (int i = 0; i < string.length(); i++) {
            tempHashSet.add(string.charAt(i));
        }

        for (Character c : tempHashSet) {
            result.append(c);
        }

        return result.toString();
    }
}