import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null) return false;            // If Object is null
        if(a.length == 0 && b.length == 0) return true;     // If both are empty
        if(a.length == 0 || b.length == 0) return false;    // If only one is empty

        Arrays.sort(a);
        Arrays.sort(b);

        int[] aSquared = new int[a.length];

        fillSquares(a, aSquared);

        return compareSquares(b, aSquared);
    }

    private static void fillSquares(int[] a, int[] aSquared) {
        for (int i = 0; i < a.length; i++) {
            aSquared[i] = a[i] * a[i];
        }
        Arrays.sort(aSquared);
    }

    private static boolean compareSquares(int[] b, int[] aSquared) {
        for (int i = 0; i < aSquared.length; i++) {
            if (aSquared[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
