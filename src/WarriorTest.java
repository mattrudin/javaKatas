import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {

    @org.junit.jupiter.api.Test
    void levelAtInitializationShouldBeOne() {
        Warrior tom = new Warrior();
        assertEquals(1, tom.level());
    }

    @org.junit.jupiter.api.Test
    void experienceAtInitializationShouldBe100() {
        Warrior tom = new Warrior();
        assertEquals(100, tom.experience());
    }

    @org.junit.jupiter.api.Test
    void rankAtInitializationShouldBePushover() {
        Warrior tom = new Warrior();
        assertEquals("Pushover", tom.rank());
    }

    @org.junit.jupiter.api.Test
    void achievementsAtInitializationShouldBeEmpty() {
        Warrior tom = new Warrior();
        assertEquals(new ArrayList<String>(), tom.achievements());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTrainingDescription() {
        Warrior tom = new Warrior();
        assertEquals("Has won", tom.training("Has won", 100, 1));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnUpdatedExperienceOf1100() {
        Warrior tom = new Warrior();
        tom.training("Has won", 1000, 1);
        assertEquals(1100, tom.experience());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnNotStrongEnough() {
        Warrior tom = new Warrior();
        assertEquals("Not strong enough", tom.training("This description is not important", 100, 2));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnUpdatedAchievements() {
        Warrior tom = new Warrior();
        tom.training("Has won", 1000, 1);
        List<String> result = asList("Has won");
        assertEquals(result, tom.achievements());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnGoodFight() {
        Warrior tom = new Warrior();
        assertEquals("A good fight", tom.battle(1));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnEasyFight() {
        Warrior tom = new Warrior();
        for (int i = 0; i < 30; i++) {
            tom.battle(1);
        }
        assertEquals("Easy fight", tom.battle(1));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnInvalidLevel() {
        Warrior tom = new Warrior();
        assertEquals("Invalid level", tom.battle(101));
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectExperienceOf110() {
        Warrior tom = new Warrior();
        tom.battle(1);
        assertEquals(110, tom.experience());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectExperienceOf200() {
        Warrior tom = new Warrior();
        for (int i = 0; i < 10; i++) {
            tom.battle(1);
        }
        assertEquals(200, tom.experience());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectExperienceOf9100() {
        Warrior tom = new Warrior();
        tom.training("Defeated Chuck Norris", 9000, 1);
        assertEquals(9100, tom.experience());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectLevelOf91() {
        Warrior tom = new Warrior();
        tom.training("Defeated Chuck Norris", 9000, 1);
        assertEquals(91, tom.level());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectRankOfMaster() {
        Warrior tom = new Warrior();
        tom.training("Defeated Chuck Norris", 9000, 1);
        assertEquals("Master", tom.rank());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectRankOfGreatest() {
        Warrior tom = new Warrior();
        tom.training("Defeated Chuck Norris", 9000, 1);
        tom.training("Defeated Chuck Norris the second", 9000, 1);
        assertEquals("Greatest", tom.rank());
    }

    @org.junit.jupiter.api.Test
    void shouldReturnCorrectLevelOf100() {
        Warrior tom = new Warrior();
        tom.training("Defeated Chuck Norris", 9000, 1);
        tom.training("Defeated Chuck Norris the second", 9000, 1);
        assertEquals(100, tom.level());
    }
}