import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    private int occurence;

    public int getOccurence() {
        return occurence;
    }

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        return 0;
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        calculateColorOccurence(mysteryColors, color);
        return getOccurence();
    }

    private void calculateColorOccurence(List<Color> mysteryColors, Color color) {
        for (Color mysteryColor : mysteryColors) {
            if (mysteryColor == color) {
                ++occurence;
            }
        }
    }
}
