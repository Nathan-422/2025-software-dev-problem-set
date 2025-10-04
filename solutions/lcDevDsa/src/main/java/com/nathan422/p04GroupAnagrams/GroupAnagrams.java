package com.nathan422.p04GroupAnagrams;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<List<String>>();
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        int[] difference = new int[26];

        for (int i = 0; i < a.length(); i++) {
            difference[a.charAt(i) - 'a']++;
            difference[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < difference.length; i++) {
            if (difference[i] != 0) {
                return false;
            }
        }

        return true;
    }


}
