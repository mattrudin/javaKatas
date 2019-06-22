package ReverseWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void ShouldRevertTwoWordsInSentence() {
        String test = "Hello you";
        String result = "you Hello";
        assertEquals(result, Reverse.words(test));
    }

    @Test
    void ShouldRevertFullSentence() {
        String test = "The greatest victory is that which requires no battle";
        String result = "battle no requires which that is victory greatest The";
        assertEquals(result, Reverse.words(test));
    }

}