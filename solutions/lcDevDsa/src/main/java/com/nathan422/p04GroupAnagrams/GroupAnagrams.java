package com.nathan422.p04GroupAnagrams;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            // convert each string to an int List
            char[] anagramFingerprint = new char[26];
            for (char l : str.toCharArray()) {
                anagramFingerprint[l - 'a']++;
            }
            String anagramKey = String.valueOf(anagramFingerprint);

            // check if that hash does not exist and add it and return array if not
            if (!anagramsMap.containsKey(anagramKey)) {
                anagramsMap.put(anagramKey, new ArrayList<>());
            }

            // add str to appropriate anagram list
            anagramsMap.get(anagramKey).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }

}
