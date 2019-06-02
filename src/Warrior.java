import java.util.ArrayList;
import java.util.List;

public class Warrior {
    private int level;
    private int experience;
    private ranks rank;
    private final List<String> achievements;
    private final int EXPERIENCE_THRESHOLD = 100;
    private final int MAX_LEVEL = 100;
    private final int MAX_EXPERIENCE = 10_000;

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
        if (experience + additionalExperience >= MAX_EXPERIENCE) {
            experience = MAX_EXPERIENCE;
        } else {
            experience += additionalExperience;
        }
    }

    private void setLevel(int level) { this.level += level; }

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
        if (Util.isLevelValid(enemyLevel)) {
            setExperience(Util.calculateExperiencePoints(level, enemyLevel));
            updateLevel();
            return "A good fight";
        } else {
            return "Invalid level";
        }
    }

    private void updateLevel() {
        int normalizedLevel = ((experience / 100) * 100) % EXPERIENCE_THRESHOLD;
        int difference = normalizedLevel - level;
        if (level + difference >= MAX_LEVEL) {
            difference = MAX_LEVEL;
        }
        setLevel(difference);
    }

    private static class Util {
        private static final int SAME_LEVEL = 10;
        private static final int ONE_LEVEL_LOWER = 5;
        private static final int TWO_LEVEL_LOWER = 0;
        private static final int ACCELERATE_CONST = 20;
        private static final int MAX_LEVEL= 100;
        private static final int MIN_LEVEL = 1;

        private static boolean isLevelValid(int level) {
            return level >= MIN_LEVEL && level <= MAX_LEVEL;
        }

        private static int calculateExperiencePoints(int ownLevel, int enemyLevel) {
            int levelDifference = calculateLevelDifference(ownLevel, enemyLevel);
            switch (levelDifference) {
                case 0:
                    return SAME_LEVEL;
                case 1:
                    return ONE_LEVEL_LOWER;
                case 2:
                    return TWO_LEVEL_LOWER;
                default:
                    int absoluteLevelDifference = Math.abs(levelDifference);
                    return ACCELERATE_CONST * absoluteLevelDifference * absoluteLevelDifference;
            }
        }

        private static int calculateLevelDifference(int ownLevel, int enemyLevel) {
            return ownLevel - enemyLevel;
        }
    }
}
