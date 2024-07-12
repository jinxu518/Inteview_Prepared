package TopInteview150;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author Jinxu Zheng
 * @Date 7/11/2024
 **/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> myMap = new HashMap<>();
        for (String ele : strs) {
            char[] charArray = ele.toCharArray();
            Arrays.sort(charArray);
            String eleSorted = new String(charArray);
            if (!myMap.containsKey(eleSorted)) {
                myMap.put(eleSorted, new ArrayList<>());
            }
            myMap.get(eleSorted).add(ele);
        }
        return new ArrayList<>(myMap.values());
    }
}
