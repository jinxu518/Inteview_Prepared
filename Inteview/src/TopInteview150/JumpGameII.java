package TopInteview150;

/**
 * @Author Jinxu Zheng
 * @Date 7/5/2024
 **/
public class JumpGameII {
    public int jump(int[] nums) {
        int length = nums.length;
        int steps = 0;
        int output = 0;
        int current = 0;
        if (1 == length) return output;

        for (int i = 0; i < length - 1; i++) {
            steps = Math.max(steps, i + nums[i]);
            if (current == i) {
                current = steps;
                output++;
                if (current >= length - 1) {
                    return output;
                }
            }
        }
        return output;
    }
}
