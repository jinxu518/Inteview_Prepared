package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 7/4/2024
 **/
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
//        canJump(new int[]{3,2,1,0,4});
        canJump(new int[]{3,2,1,0,0});
    }
}
