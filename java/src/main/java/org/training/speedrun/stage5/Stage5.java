package org.training.speedrun.stage5;

import java.util.Arrays;
import java.util.List;

/**
 * Refactor this code until all methods body is <= 5 lines, and you find the code clean.
 */
public class Stage5 {

    boolean isEligible(String word) {
        if (word.length() >= 10) {
            return isLongWordEligible(word);
        }
        return isShortWordEligble(word);
    }

    private boolean isShortWordEligble(String word) {
        return getNumberOfLettersInUpperCase(word) >= 5 || getNumberOfVowels(word) >= 3;
    }

    private long getNumberOfLettersInUpperCase(String word) {
        return word.chars().filter(c -> c >= 'A' && c <= 'Z').count();
    }

    private long getNumberOfVowels(String word) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
        return word.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
    }

    private boolean isLongWordEligible(String word) {
        return getNumberOfVowels(word) >= 4 || getNumberOfSpecialLetters(word) >= 3;
    }

    private long getNumberOfSpecialLetters(String word) {
        List<Character> specialLetters = Arrays.asList('p', 'm');
        return word.chars().mapToObj(c -> (char) c).filter(specialLetters::contains).count();
    }
}
