public class ReverseWord {
    public static String reverseWords(final String original) {
        if (original.isBlank()) {
            return original;
        }
        String[] originalSplitted = original.split(" ");
        String[] reversedSplitted = new String[originalSplitted.length];
        for (int i = 0; i < originalSplitted.length; i++) {
            reversedSplitted[i] = reverseWord(originalSplitted[i]);
        }
        return String.join(" ", reversedSplitted);
    }

    private static String reverseWord(String word) {
        StringBuilder wordReverse = new StringBuilder(word).reverse();
        return wordReverse.toString();
    }

}