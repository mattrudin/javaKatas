import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    private int occurence;

    private int getOccurrence() {
        return occurence;
    }

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        Set<Color> colors = new HashSet<>(mysteryColors);
        return colors.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        calculateColorOccurrence(mysteryColors, color);
        return getOccurrence();
    }

    private void calculateColorOccurrence(List<Color> mysteryColors, Color color) {
        for (Color mysteryColor : mysteryColors) {
            if (mysteryColor == color) {
                ++occurence;
            }
        }
    }
}
