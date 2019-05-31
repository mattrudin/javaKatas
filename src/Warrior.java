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

    public List achievements() { return achievements; }
}
