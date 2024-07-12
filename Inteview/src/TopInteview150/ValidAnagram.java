package TopInteview150;

import java.util.Arrays;

/**
 * @Author Jinxu Zheng
 * @Date 7/11/2024
 **/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return sortString(s).equals(sortString(t));
    }
    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
