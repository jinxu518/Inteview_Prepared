package TopInteview150;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Author Jinxu Zheng
 * @Date 1/24/2024
 **/
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length/2];
    }
    public static void main(String[] args)throws Exception{
        int i = majorityElement(new int[]{3, 2, 3});
        System.out.println(i);
    }
}
