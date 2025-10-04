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

        assertEquals(expected, anagram.groupAnagrams(s));
    }

}