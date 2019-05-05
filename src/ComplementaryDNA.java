public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        char[] result = dna.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 'A') {
                result[i] = 'T';
            } else if (result[i] == 'T') {
                result[i] = 'A';
            } else if (result[i] == 'G') {
                result[i] = 'C';
            } else if (result[i] == 'C') {
                result[i] = 'G';
            }
        }
        return new String(result);
    }
}