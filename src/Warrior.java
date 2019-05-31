import java.util.ArrayList;
import java.util.List;

public class Warrior {
    private int level;
    private int experience;
    private ranks rank;
    private final List<String> achievements;

    private enum ranks {
        Pushover, Novice, Fighter, Warrior, Veteran, Sage, Elite, Conqueror, Champion, Master, Greatest;
    }

    public Warrior() {
        level = 1;
        experience = 100;
        rank = ranks.Pushover;
        achievements = new ArrayList<>();
    }

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

    private void addAchievement(String description) {
        achievements.add(description);
    }

    public String training(String description, int experience, int minimumLevel) {
        if (level >= minimumLevel) {
            setExperience(experience);
            addAchievement(description);
            return description;
        } else {
            return "Not strong enough";
        }
    }

    // The following methods will be used for battle
    private boolean isLevelValid(int level) {
        return level >= 1 && level <= 100;
    }

    private int calculateExperiencePoints(int experience, int level) {
        int result = 0;
        return result;
    }
}
