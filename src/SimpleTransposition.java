public class SimpleTransposition {
    public static String simpleTransposition(String text) {
        char[] splitted = text.toCharArray();
        StringBuilder rowOne = new StringBuilder();
        StringBuilder rowTwo = new StringBuilder();

        for (int i = 0; i < splitted.length; i++) {
            if (i % 2 == 0) {
                rowOne.append(splitted[i]);
            } else {
                rowTwo.append(splitted[i]);
            }
        }

        return rowOne.toString() + rowTwo.toString();
    }
}
