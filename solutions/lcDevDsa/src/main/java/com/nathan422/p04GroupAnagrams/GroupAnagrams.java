package com.nathan422.p04GroupAnagrams;
import java.util.List;
import java.util.ArrayList;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<List<String>>();
        for (String str : strs) {
//            convert each string to an int List
//            check if that hash does not exist and add it and return array if not
//            add str to appropriate anagram list

        }

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
