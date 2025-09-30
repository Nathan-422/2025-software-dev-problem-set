import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String wordA = "cat";
        String wordB = "ctA";

        isAnagram(wordA, wordB);
    }
    public static boolean isAnagram(String wordA, String wordB) {
        wordA = wordA.toLowerCase();
        wordB = wordB.toLowerCase();

        // sanitize data

        final HashMap<String,Integer> wordAMap = new HashMap<>();
        final HashMap<String,Integer> wordBMap = new HashMap<>();

        for (String c : wordA.split("")) {
            if (wordAMap.containsKey(c.toString())) {
                wordAMap.put(c.toString(), wordAMap.get(c) + 1);
            }
        }

        // count letters in each word        

        for (String c : wordB.split("")) {
            if (wordBMap.containsKey(c.toString())) {
                wordBMap.put(c.toString(), wordBMap.get(c) + 1);
            }
        }

        // check equality

        
        return false;
    }
}