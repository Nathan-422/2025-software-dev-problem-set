package com.nathan422.p02ValidAnagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void validAnagramReturnsTrue() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(Anagram.isAnagram(s, t));
    }

    @Test
    void invalidAnagramReturnsFalse() {
        String s = "rat";
        String t = "car";

        assertFalse(Anagram.isAnagram(s, t));
    }
}