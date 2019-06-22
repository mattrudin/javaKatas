import java.util.LinkedList;

public class AlternativeSplit {
    public static String encrypt(final String text, final int n) {
        if(n <= 0 || text.isEmpty()) return text;

        char[] chars = text.toCharArray();
        StringBuilder rowOne = new StringBuilder();
        StringBuilder rowTwo = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                rowTwo.append(chars[i]);
            } else {
                rowOne.append(chars[i]);
            }
        }

        String result = rowOne.toString() + rowTwo.toString();

        return encrypt(result, n - 1);
    }

    public static String decrypt(final String encryptedText, final int n) {
        if(n <= 0 || encryptedText.isEmpty()) return encryptedText;

        LinkedList<Character> first = new LinkedList<>();
        LinkedList<Character> second = new LinkedList<>();

        char[] firstPart = encryptedText.substring(0, encryptedText.length() / 2).toCharArray();
        char[] secondPart = encryptedText.substring(encryptedText.length() / 2).toCharArray();

        fillUpList(firstPart, first);
        fillUpList(secondPart, second);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            if (i % 2 == 0) {
                result.append(first.pop());
            } else {
                result.append(second.pop());
            }
        }

        return decrypt(result.toString(), n - 1);
    }

    private static void fillUpList(char[] array, LinkedList<Character> list) {
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
    }
}
