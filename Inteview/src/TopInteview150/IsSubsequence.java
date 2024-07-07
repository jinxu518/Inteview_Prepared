package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 7/5/2024
 **/
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int si=0;
        if(s.length()<1)
            return true;
        for(int i=0;i<t.length();i++){
            if(s.charAt(si)==t.charAt(i))
                si++;

            if(si==s.length())
                return true;
        }

        return false;
    }
}