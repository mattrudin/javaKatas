import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {

    @org.junit.jupiter.api.Test
    void levelAtInitializationShouldBeOne() {
        Warrior tom = new Warrior();
        assertEquals(1, tom.level());
    }

    @org.junit.jupiter.api.Test
    void experienceAtInitializationShouldBeOnehundred() {
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
}