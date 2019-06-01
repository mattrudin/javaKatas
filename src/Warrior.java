import java.util.ArrayList;
import java.util.List;

public class Warrior {
    private final Util util = new Util();
    private int level;
    private int experience;
    private ranks rank;
    private final List<String> achievements;

    private enum ranks {
        Pushover, Novice, Fighter, Warrior, Veteran, Sage, Elite, Conqueror, Champion, Master, Greatest;

        private static int currentRank = 0;
        private static final int SIZE = 11;
        public static ranks next() { return currentRank < SIZE ? values()[++currentRank] : ranks.Greatest; }
    }

    // Constructor
    public Warrior() {
        level = 1;
        experience = 100;
        rank = ranks.Pushover;
        achievements = new ArrayList<>();
    }

    // Getters and setters
    public int level() {
        return level;
    }

    public int experience() {
        return experience;
    }

    public String rank() {
        return rank.toString();
    }

    public List achievements() {
        return achievements;
    }

    private void setExperience(int additionalExperience) {
        experience += additionalExperience;
    }

    private void increaseLevel() { level++; }

    private void increaseRank() { rank = ranks.next(); }

    private void addAchievement(String description) {
        achievements.add(description);
    }

    // Training method
    public String training(String description, int experience, int minimumLevel) {
        if (level >= minimumLevel) {
            setExperience(experience);
            addAchievement(description);
            return description;
        } else {
            return "Not strong enough";
        }
    }

    // Battle method
    public String battle(int enemyLevel) {
        if (util.isLevelValid(enemyLevel)) {
            return "A good fight";
        } else {
            return "Invalid level";
        }
    }

    private static class Util {
        private boolean isLevelValid(int level) {
            return level >= 1 && level <= 100;
        }

        private int calculateExperiencePoints(int experience, int level) {
            int result = 0;
            return result;
        }
    }
}
