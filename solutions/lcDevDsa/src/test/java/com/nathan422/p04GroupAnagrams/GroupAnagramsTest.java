package com.nathan422.p04GroupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void returnIsNotNull() {
        GroupAnagrams anagram = new GroupAnagrams();
        Assertions.assertTrue(anagram.groupAnagrams(new String[]{"man", "nam"}) != null);
    }

    @Test
    public void properlyGroupsNormalArrays() {
        GroupAnagrams anagram = new GroupAnagrams();
        String[] s = new String[]{"eat","tea","tan","ate","nat","bat"};

        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("eat", "tea", "ate")));
        expected.add(new ArrayList<String>(Arrays.asList("tan", "nat")));
        expected.add(new ArrayList<String>(Arrays.asList("bat")));

        expected.sort((a, b) -> {
            return a.size() - b.size();
        });
        List<List<String>> tested = anagram.groupAnagrams(s);
        tested.sort((a, b) -> {
            return a.size() - b.size();
        });
        assertEquals(expected, tested);
    }

    @Test
    public void worksWithEmptyStringAsArgument() {
        GroupAnagrams anagram = new GroupAnagrams();
        String[] s = new String[]{""};

        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("")));

        assertEquals(expected, anagram.groupAnagrams(s));
    }

    @Test
    public void worksWithOneCharStringAsArgument() {
        GroupAnagrams anagram = new GroupAnagrams();
        String[] s = new String[]{""};

        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(new ArrayList<String>(Arrays.asList("")));

        assertEquals(expected, anagram.groupAnagrams(s));
    }
}