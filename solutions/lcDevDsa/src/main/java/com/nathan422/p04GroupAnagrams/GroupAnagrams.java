package com.nathan422.p04GroupAnagrams;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> anagramsMap = new HashMap<>();
        for (String str : strs) {
            // convert each string to an int List
            List<Integer> anagramFingerprint = new ArrayList<>(Collections.nCopies(26, 0));
            for (char l : str.toCharArray()) {
                anagramFingerprint.set(l - 'a', anagramFingerprint.get(l - 'a') + 1);
            }

            // check if that hash does not exist and add it and return array if not
            if (!anagramsMap.containsKey(anagramFingerprint)) {
                anagramsMap.put(anagramFingerprint, new ArrayList<>());
            }

            // add str to appropriate anagram list
            anagramsMap.get(anagramFingerprint).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }

}
