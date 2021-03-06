public class PlayPass {
    public static String playPass(String phraseToPass, int shift) {
        return new Builder(phraseToPass)
                .shiftBy(shift)
                .replaceByComplementOf(9)
                .downCaseUpCase()
                .reverseString()
                .build();
    }

    private static class Builder {
        private final char[] passPhrase;

        private Builder(String phraseToPass) {
            passPhrase = phraseToPass.toCharArray();
        }

        private Builder shiftBy(final int shift) {
            for (int i = 0; i < passPhrase.length; i++) {
                if(Character.isLetter(passPhrase[i])) {
                    char letter = Character.toLowerCase(passPhrase[i]);
                    letter = (char) (letter + shift);
                    if(letter > 'z') {
                        letter = (char) (letter - 26);
                    }
                    passPhrase[i] = letter;
                }
            }
            return this;
        }

        private Builder replaceByComplementOf(final int complement) {
            for (int i = 0; i < passPhrase.length; i++) {
                if(Character.isDigit(passPhrase[i])) {
                    int number = Character.getNumericValue(passPhrase[i]);
                    passPhrase[i] = (char) ((complement - number) + '0');
                }
            }
            return this;
        }

        private Builder downCaseUpCase() {
            for (int i = 0; i < passPhrase.length; i++) {
                if(i % 2 == 0 && Character.isLetter(passPhrase[i])) {
                    passPhrase[i] = Character.toUpperCase(passPhrase[i]);
                } else {
                    passPhrase[i] = Character.toLowerCase(passPhrase[i]);
                }
            }
            return this;
        }

        private Builder reverseString() {
            final int size = passPhrase.length - 1;
            for (int i = 0; i < passPhrase.length / 2; i++) {
                char temp = passPhrase[i];
                passPhrase[i] = passPhrase[size - i];
                passPhrase[size - i] = temp;
            }
            return this;
        }

        private String build() {
            return String.valueOf(passPhrase);
        }
    }
}
