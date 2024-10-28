import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordFormation {
    public static void main(String[] args) {
        String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
        String input1 = "abcd";
        System.out.println(getFormableWords(dict1, input1)); 

        String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
        String input2 = "caab";
        System.out.println(getFormableWords(dict2, input2)); 
    }

    public static List<String> getFormableWords(String[] dict, String input) {
        List<String> result = new ArrayList<>();
        
        HashMap<Character, Integer> inputFreq = new HashMap<>();
        for (char c : input.toCharArray()) {
            inputFreq.put(c, inputFreq.getOrDefault(c, 0) + 1);
        }

        // Check each word in the dictionary
        for (String word : dict) {
            if (canFormWord(word, inputFreq)) {
                result.add(word);
            }
        }
        
        return result;
    }

    private static boolean canFormWord(String word, HashMap<Character, Integer> inputFreq) {
        HashMap<Character, Integer> wordFreq = new HashMap<>();
        
        for (char c : word.toCharArray()) {
            wordFreq.put(c, wordFreq.getOrDefault(c, 0) + 1);
            if (wordFreq.get(c) > inputFreq.getOrDefault(c, 0)) {
                return false;
            }
        }
        
        return true;
    }
}
