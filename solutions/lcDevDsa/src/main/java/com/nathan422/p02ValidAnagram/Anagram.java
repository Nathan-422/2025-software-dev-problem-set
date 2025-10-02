package com.nathan422.p02ValidAnagram;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String wordA, String wordB) {
        // sanitize data
        wordA = wordA.toLowerCase();
        wordB = wordB.toLowerCase();

        // count letters in each word
        final HashMap<String,Integer> wordAMap = new HashMap<>();
        final HashMap<String,Integer> wordBMap = new HashMap<>();

        for (String c : wordA.split("")) {
            if (wordAMap.containsKey(c.toString())) {
                wordAMap.put(c.toString(), wordAMap.get(c) + 1);
            } else {
                wordAMap.put(c, 1);
            }
        }

        for (String c : wordB.split("")) {
            if (wordBMap.containsKey(c.toString())) {
                wordBMap.put(c.toString(), wordBMap.get(c) + 1);
            } else {
                wordBMap.put(c, 1);
            }
        }

        // look for inequality
        if (wordAMap.keySet().size() != wordBMap.keySet().size()) {
            return false;
        }

        for (String s : wordAMap.keySet()) {
            if (!wordAMap.get(s).equals(wordBMap.get(s))) {
                return false;
            }
        }

        // found no inequality
        return true;
    }
}