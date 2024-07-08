package TopInteview150;

import java.util.HashMap;

/**
 * @Author Jinxu Zheng
 * @Date 7/6/2024
 **/
public class RansomNote {
    public boolean canConstruct(String r, String m) {
        if (r.length() > m.length()) return false;
        HashMap<Character, Integer> rMap = new HashMap<>();

        for (char c : r.toCharArray()) {
            rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }
        int co=rMap.size();
        for(char c : m.toCharArray()){
            if(rMap.containsKey(c)){
                rMap.put(c,rMap.get(c)-1);
                if(rMap.get(c)==0) {
                    rMap.remove(c);
                    co--;
                }
                if(co==0) return true;
            }
        }
        return false;
    }
}
