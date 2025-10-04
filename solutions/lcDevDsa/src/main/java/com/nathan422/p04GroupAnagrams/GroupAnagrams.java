package com.nathan422.p04GroupAnagrams;
import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, Integer> insertionIndex = new HashMap<>();
        List<List<String>> output = new ArrayList<List<String>>();
        for (String str : strs) {
            // convert each string to an int List
            List<Integer> anagramFingerprint = new ArrayList<>(Collections.nCopies(26, 0));
            for (char l : str.toCharArray()) {
                anagramFingerprint.set(l - 'a', anagramFingerprint.get(l - 'a') + 1);
            }

            // check if that hash does not exist and add it and return array if not
            if (!(insertionIndex.containsKey(anagramFingerprint))) {
                int insertionPoint = output.size();
                output.add(new ArrayList<>());
                insertionIndex.put(anagramFingerprint, insertionPoint);
            }

            // add str to appropriate anagram list
            output.get(insertionIndex.get(anagramFingerprint)).add(str);
        }

        return output;
    }

}
