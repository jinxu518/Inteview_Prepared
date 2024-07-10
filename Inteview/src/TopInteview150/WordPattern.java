package TopInteview150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Jinxu Zheng
 * @Date 7/9/2024
 **/
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pToStr = new HashMap<>();
        Map<String, Character> strToP = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String word = words[i];
            // Check if there's a conflict in the mapping from pattern to word
            if (pToStr.containsKey(pChar) && !pToStr.get(pChar).equals(word)) {
                return false;
            }
            if (strToP.containsKey(word) && strToP.get(word) != pChar) {
                return false;
            }
            pToStr.put(pChar, word);
            strToP.put(word, pChar);
        }
        return true;
    }
}
